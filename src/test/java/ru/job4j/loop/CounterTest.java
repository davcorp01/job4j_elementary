package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.ThreeMax;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyThreeThenOneHundredTwelve() {
        int start = 10;
        int finish = 23;
        int result = Counter.sumByEven(start, finish);
        int expected = 112;
        Assert.assertEquals(expected, result);
    }
}