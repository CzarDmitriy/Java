package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax128more400Then400() {
        int left = 128;
        int right = 400;
        int expected = 400;
        int result = left > right ? left : right;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax128less400Then128() {
        int left = 128;
        int right = 400;
        int expected = 128;
        int result = left < right ? left : right;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax128equals400Then128() {
        int left = 128;
        int right = 400;
        int expected = 400;
        int result = left == right ? left : right;
        Assert.assertEquals(expected, result);
    }

}