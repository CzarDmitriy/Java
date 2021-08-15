package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 183;
        short expected = 95;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 95.0);
    }

    @Test
    public void womanWeight() {
        short in = 170;
        short expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 69.0);
    }
}