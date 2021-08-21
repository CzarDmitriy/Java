package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitnessTest {

    @Test
    public void calc() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }
}