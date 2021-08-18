package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax128to400Then400() {
        int in1 = 128;
        int in2 = 400;
        int expected = 400;
        int result = Max.max(in1, in2);
        Assert.assertEquals(expected, result);
    }

}