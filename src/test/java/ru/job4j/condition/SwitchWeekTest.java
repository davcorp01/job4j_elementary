package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {
        @Test
        public void testNameDay() {
            int day = 5;
            String result = SwitchWeek.nameOfDay(day);
            String expected = "Пятница";
            Assert.assertEquals(expected, result);
        }

}