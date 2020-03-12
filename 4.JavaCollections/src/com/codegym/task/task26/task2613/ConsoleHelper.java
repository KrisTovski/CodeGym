package com.codegym.task.task26.task2613;

import com.codegym.task.task26.task2613.exception.InterruptedOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class ConsoleHelper {
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "common_en");
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }




    public static String readString() throws InterruptedOperationException {

        String input = "";
        try {
            input = bis.readLine();
            if (input.equalsIgnoreCase("exit")) {
               writeMessage(res.getString("the.end"));
            }
        } catch (IOException ignored) {}

        return input;

    }

    public static String requestCurrencyCode() throws InterruptedOperationException {
        String currency;
        while (true) {
            writeMessage(res.getString("choose.currency.code"));
            currency = readString();
            if (currency.matches("[A-Za-z]{3}") && currency.length() == 3) break;
            writeMessage(res.getString("invalid.data"));

        }
        return currency.toUpperCase();
    }

    public static String[] getTwoValidNumbers(String currencyCode) throws InterruptedOperationException {
        int denomination;
        int number;
        String[] array;
        while (true) {
            writeMessage(String.format(res.getString("choose.denomination.and.count.format"),currencyCode));
            array = readString().split(" ");

            try {
                denomination = Integer.parseInt(array[0]);
                number = Integer.parseInt(array[1]);

                if (denomination <= 0 || number <= 0) throw new NumberFormatException();
                return new String[]{array[0],array[1]};
            } catch (Exception e) {
                writeMessage(res.getString("invalid.data"));
            }
        }

    }

    public static Operation requestOperation() throws InterruptedOperationException{
        writeMessage(res.getString("choose.operation"));
        while(true) {
            writeMessage(res.getString("choose.operation"));
            writeMessage("1 - " + res.getString("operation.INFO"));
            writeMessage("2 - " + res.getString("operation.DEPOSIT"));
            writeMessage("3 - " + res.getString("operation.WITHDRAW"));
            writeMessage("4 - " + res.getString("operation.EXIT"));
            try {
               int i = Integer.parseInt(bis.readLine());
                return Operation.getAllowableOperationByOrdinal(i);
            }catch (IllegalArgumentException | IOException e) {
                writeMessage(res.getString("invalid.data"));
            }
        }
    }
    public static void printExitMessage(){
        ConsoleHelper.writeMessage(res.getString("the.end"));
    }


}
