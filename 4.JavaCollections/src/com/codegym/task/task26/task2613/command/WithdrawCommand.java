package com.codegym.task.task26.task2613.command;

import com.codegym.task.task26.task2613.CashMachine;
import com.codegym.task.task26.task2613.ConsoleHelper;
import com.codegym.task.task26.task2613.CurrencyManipulator;
import com.codegym.task.task26.task2613.CurrencyManipulatorFactory;
import com.codegym.task.task26.task2613.exception.InsufficientFundsException;
import com.codegym.task.task26.task2613.exception.InterruptedOperationException;

import java.util.Map;
import java.util.ResourceBundle;

class WithdrawCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "withdraw_en");
    @Override
    public void execute() throws InterruptedOperationException {
        String currencyCode = ConsoleHelper.requestCurrencyCode();
        CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        String expectedAmount = "";

        ConsoleHelper.writeMessage(res.getString("before"));
        while (true) {
            ConsoleHelper.writeMessage(res.getString("specify.amount"));
            expectedAmount = ConsoleHelper.readString();
            if (expectedAmount.matches("\\d+")) {
                if (currencyManipulator.isAmountAvailable(Integer.parseInt(expectedAmount))) break;
                else ConsoleHelper.writeMessage(res.getString("not.enough.money"));
            } else {
                ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));
            }

        }
        try {
            Map<Integer, Integer> map = currencyManipulator.withdrawAmount(Integer.parseInt(expectedAmount));
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"), expectedAmount,currencyCode));

        } catch (InsufficientFundsException e) {
            ConsoleHelper.writeMessage(res.getString("exact.amount.not.available"));
        }
    }
}
