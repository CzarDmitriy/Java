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
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquareThen44() {
        short p = 22;
        short k = 44;
        float expected = 2.0f;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 2.0);
    }

    @Test
    public void whenSquareThen43() {
        short p = 140;
        short k = 333;
        float expected = 14.0f;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 14.0);
    }
}