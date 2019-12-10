package com.codegym.task.task14.task1408;

/*
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if (continent.equals("North America"))
                return new NorthAmericanHen();

            else if (continent.equals("Europe"))
                return new EuropeanHen();

            else if (continent.equals("Asia"))
                return new AsianHen();

            else if (continent.equals("Africa"))
                return new AfricanHen();

            else return hen;



        }
    }

}

