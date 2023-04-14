package ru.job4j.loop;
/*
Job4j Упражнения 1.1.5. Циклы 10. Найти сумму каждого второго числа в диапазоне
https://job4j.ru/profile/topics/14/task_code/112/159477
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSumTest {

    @Test
    public void test() {
        assertEquals(1, SecondSum.sum(1, 2));
        assertEquals(4, SecondSum.sum(1, 3));
        assertEquals(4, SecondSum.sum(1, 4));
        assertEquals(9, SecondSum.sum(1, 5));
        assertEquals(12, SecondSum.sum(0, 6));
    }

}