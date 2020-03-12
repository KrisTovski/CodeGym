package com.codegym.task.task33.task3310.tests;

import com.codegym.task.task33.task3310.Helper;
import com.codegym.task.task33.task3310.Shortener;
import com.codegym.task.task33.task3310.Solution;
import com.codegym.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.codegym.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date startTime = new Date();
        ids = Solution.getIds(shortener, strings);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date startTime = new Date();
        strings = Solution.getStrings(shortener, ids);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());
        Set<String> origStrings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());
        }
        Set<Long> ids1 = new HashSet<>();
        Set<Long> ids2 = new HashSet<>();

        long timeForHashMapStorageStrategy = getTimeToGetIds(shortener1, origStrings, ids1);
        long timeForHashBiMapStorageStrategy = getTimeToGetIds(shortener2, origStrings, ids2);
        Assert.assertTrue(timeForHashMapStorageStrategy > timeForHashBiMapStorageStrategy);

        Set<String> string1 = new HashSet<>();
        Set<String> string2 = new HashSet<>();

        long timeForStringHashMapStorageStrategy = getTimeToGetStrings(shortener1, ids1, string1);
        long timeForStringHashBiMapStorageStrategy = getTimeToGetStrings(shortener2, ids2, string2);
        Assert.assertEquals(timeForStringHashMapStorageStrategy, timeForStringHashBiMapStorageStrategy, 30);


    }
}
