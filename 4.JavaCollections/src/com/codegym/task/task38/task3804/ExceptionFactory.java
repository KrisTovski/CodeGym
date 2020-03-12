package com.codegym.task.task38.task3804;

public class ExceptionFactory {

    public static Throwable getException(Enum enumException){
        if(enumException == null)
            return new IllegalArgumentException();

        String message = enumException.name().charAt(0)
                + enumException.name().substring(1).toLowerCase().replace("_", " ");

        if(enumException instanceof ApplicationExceptionMessage)
            return new Exception(message);
        if(enumException instanceof DatabaseExceptionMessage)
            return new RuntimeException(message);
        if(enumException instanceof UserExceptionMessage)
            return new Error(message);

        return new IllegalArgumentException();
    }
}
