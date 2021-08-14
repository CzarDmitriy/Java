package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class PointsTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to32then2() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 3;
        int y2 = 2;
        double expected = 2.23606797749979;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when302to142then16() {
        int x1 = 30;
        int y1 = 2;
        int x2 = 14;
        int y2 = 2;
        double expected = 16.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}