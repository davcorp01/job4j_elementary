package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {
    @Test
    public void testNameDay() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}