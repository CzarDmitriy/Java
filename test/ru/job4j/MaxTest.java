package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax128more400Then400() {
        int left = 128;
        int right = 400;
        int expected = 400;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax800to400Then800() {
        int left = 800;
        int right = 4;
        int expected = 800;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1000to4332Then800() {
        int left = 1000;
        int right = 4332;
        int expected = 4332;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}