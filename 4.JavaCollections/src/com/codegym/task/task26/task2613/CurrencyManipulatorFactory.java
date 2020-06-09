package com.codegym.task.task26.task2613;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> currency = new HashMap<>();

    private CurrencyManipulatorFactory() {
    }

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (currency.containsKey(currencyCode.toLowerCase())) {
            return currency.get(currencyCode.toLowerCase());
        } else {
            CurrencyManipulator currencyManipulator = new CurrencyManipulator(currencyCode);
            currency.put(currencyCode.toLowerCase(), currencyManipulator);
            return currencyManipulator;
        }
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return currency.values();
    }
}
