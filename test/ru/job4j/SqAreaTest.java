package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenSquareThen1() {
        short p = 4;
        short k = 1;
        short expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 1.0);
    }
}