package com.codegym.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        ConsoleHelper.writeMessage("Input server port: ");
        int serverPort = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            ConsoleHelper.writeMessage("Server started...");
            while (true) {
                //  new Handler(socket.accept()).start();
//                  or
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Something wrong, Server socket closed.");
        }


    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Message can't be sent");
            }


        }

    }

    private static class Handler extends Thread {

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            if (socket != null && socket.getRemoteSocketAddress() != null) {
                ConsoleHelper.writeMessage("New connection was established with a remote address: "
                        + socket.getRemoteSocketAddress());
            }

            String userName = null;

            try (Connection connection = new Connection(socket)) {

                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection,userName);
                serverMainLoop(connection, userName);



            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if(userName !=null){
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
            }

        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();

                if (answer.getType() == MessageType.USER_NAME) {

                    if (!answer.getData().isEmpty()) {
                        if (!connectionMap.containsKey(answer.getData())) {
                            connectionMap.put(answer.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answer.getData();
                        }
                    }
                }
            }

        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }

            }

        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));

                } else {
                    ConsoleHelper.writeMessage("Error! Received message is not text!");
                }
            }
        }


    }


}
