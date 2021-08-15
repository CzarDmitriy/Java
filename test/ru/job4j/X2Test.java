package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;

        int expected = 10;
        int res1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, res1);

    }

    @Test
    public void whenA1B1C1X1then1() {
        int a = 1;
        int b = 0;
        int c = 0;
        int x = 1;

        int expected = 1;
        int res1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, res1);
    }

    @Test
    public void whenA0B1C1X1then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 2;
        int res1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, res1);
    }

    @Test
    public void whenA1B1C0X1then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;

        int expected = 2;
        int res1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, res1);
    }

    @Test
    public void whenA1B1C1X0then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int expected = 1;
        int res1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, res1);
    }

}