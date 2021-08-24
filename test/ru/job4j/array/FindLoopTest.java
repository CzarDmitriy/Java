package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] date = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(date, el);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }
}