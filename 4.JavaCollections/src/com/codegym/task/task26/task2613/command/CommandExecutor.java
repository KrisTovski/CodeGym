package com.codegym.task.task26.task2613.command;

import com.codegym.task.task26.task2613.Operation;
import com.codegym.task.task26.task2613.exception.InterruptedOperationException;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();
    static {
        allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    public static final void execute(Operation operation) throws InterruptedOperationException {
        allKnownCommandsMap.get(operation).execute();

    }
}
