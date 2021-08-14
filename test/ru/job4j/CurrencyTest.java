package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {

    @Test
    public void whenCurrency140RblThen2Euro() {
        float in = 140;
        float expected = 2.3333333f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenCurrency300RblThen4() {
        float in = 300;
        float expected = 4.285714f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.022f;
        Assert.assertEquals(expected, out, eps);
    }
}