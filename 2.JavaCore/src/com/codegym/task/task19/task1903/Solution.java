package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");

    }


    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNumberTenDigits = String.format("%010d", data.getPhoneNumber());
            String phoneNumberPart1 = "+" + data.getCountryPhoneCode();
            String phoneNumberPart2 = phoneNumberTenDigits.substring(0,3);
            String phoneNumberPart3 = phoneNumberTenDigits.substring(3,6);
            String phoneNumberPart4 = phoneNumberTenDigits.substring(6,8);
            String phoneNumberPart5 = phoneNumberTenDigits.substring(8,10);

            String fullFormatedPhoneNumber = String.format("%s(%s)%s-%s-%s",
                    phoneNumberPart1,
                    phoneNumberPart2,
                    phoneNumberPart3,
                    phoneNumberPart4,
                    phoneNumberPart5);

            return fullFormatedPhoneNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}