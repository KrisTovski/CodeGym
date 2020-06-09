package com.codegym.task.task33.task3310;

import com.codegym.task.task33.task3310.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        StorageStrategy strategy1 = new HashMapStorageStrategy();
        testStrategy(strategy1, 10000);
        StorageStrategy strategy2 = new OurHashMapStorageStrategy();
        testStrategy(strategy2, 10000);
        StorageStrategy strategy3 = new FileStorageStrategy();
        testStrategy(strategy3, 100);
        StorageStrategy strategy4 = new OurHashBiMapStorageStrategy();
        testStrategy(strategy4, 10000);
        StorageStrategy strategy5 = new HashBiMapStorageStrategy();
        testStrategy(strategy5, 10000);
        StorageStrategy strategy6 = new DualHashBidiMapStorageStrategy();
        testStrategy(strategy6, 10000);

    }


    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> result = new HashSet<>();
        for (String s : strings) {
            result.add(shortener.getId(s));
        }
        return result;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> result = new HashSet<>();
        for (Long id : keys) {
            result.add(shortener.getString(id));
        }
        return result;

    }
    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        //6.2.3.1. Display the name of the class strategy. The name must not include the package name.
        System.out.println(strategy.getClass().getSimpleName());


        //6.2.3.2. Generate a test set using Helper and the specified number of elements (elementsNumber).
        Set<String> strings = new HashSet<>();

        for(long i = 0; i<elementsNumber;i++){
            strings.add(Helper.generateRandomString());
        }

        //6.2.3.3. Create a Shortener object using the passed strategy.
        Shortener shortener = new Shortener(strategy);

        //6.2.3.4. Measure and display the time required to run the getIds method for the given strategy and
        // the given set of elements. Display time in milliseconds. When measuring the method's execution time,
        // you can ignore the processor switching to other threads, as well as the time spent on the call itself,
        // returning values, and calling methods to get the time (date). Measure time using Date objects.
        Set<Long> resultKeys;
        Date startDate = new Date();
        resultKeys = getIds(shortener, strings);
        Date endDate = new Date();

        long resultTime = endDate.getTime() - startDate.getTime();
        Helper.printMessage(Long.toString(resultTime));


        //6.2.3.5. Measure and display the time required to run the getStrings method for a given strategy and
        // the set of identifiers obtained in the previous clause.
        Set<String> resultStrings;
        startDate = new Date();
        resultStrings = getStrings(shortener, resultKeys);
        endDate = new Date();
        resultTime = endDate.getTime() - startDate.getTime();
        Helper.printMessage(Long.toString(resultTime));

        //6.2.3.6. Check whether the contents of the set of generated strings and
        // the set returned by getStrings method are the same. If the sets are the same,
        // then display "The test passed.". Otherwise, display "The test failed.".
        if(strings.equals(resultStrings)){
            Helper.printMessage("The test passed.");
        } else {
            Helper.printMessage("The test failed.");
        }
    }
}
