package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class WeightTest {

    @Test
    public void whenManWeight180Then70() {
        short in = 180;
        double expected = 70.42544881889765;
        double out = Weight.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeight175Then60() {
        short in = 175;
        double expected = 60.31320472440945;
        double out = Weight.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}