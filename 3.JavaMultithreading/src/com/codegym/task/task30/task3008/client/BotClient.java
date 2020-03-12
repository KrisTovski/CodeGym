package com.codegym.task.task30.task3008.client;

import com.codegym.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }

    @Override
    protected String getUserName() {
        int x = (int) (Math.random() * 100);
        String botName = "date_bot_" + x;
        return botName;
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Hello, there. I'm a bot. I understand the following commands: date, day, month, year, time, hour, minutes, seconds.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String pattern = null;
            if (message.contains(":")) {
                String[] splitedMessage = message.split(": ");
                if (splitedMessage.length == 2 && splitedMessage[1] != null) {
                    String name = splitedMessage[0];
                    String text = splitedMessage[1];
                    switch (text) {
                        case "date":
                            pattern = "d.MM.YYYY";
                            break;

                        case "day":
                            pattern = "d";
                            break;

                        case "month":
                            pattern = "MMMM";
                            break;

                        case "year":
                            pattern = "YYYY";
                            break;

                        case "time":
                            pattern = "H:mm:ss";
                            break;

                        case "hour":
                            pattern = "H";
                            break;

                        case "minutes":
                            pattern = "m";
                            break;

                        case "seconds":
                            pattern = "s";
                            break;
                    }
                    if (pattern != null) {
                        sendTextMessage(String.format("Information for " + name +": "
                                + new SimpleDateFormat(pattern).format(Calendar.getInstance().getTime())));
                    }

                }
            }
        }
    }
}
