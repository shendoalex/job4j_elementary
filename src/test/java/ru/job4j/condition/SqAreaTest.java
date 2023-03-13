package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double pIn = 6;
        double kIn = 2;
        double expected = 2;
        double out = SqArea.square(pIn, kIn);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K5Square0dot31() {
        double pIn = 3;
        double kIn = 5;
        double expected = 0.31;
        double out = SqArea.square(pIn, kIn);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K3Square0dot75() {
        double pIn = 4;
        double kIn = 3;
        double expected = 0.75;
        double out = SqArea.square(pIn, kIn);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K2Square1dot38() {
        double pIn = 5;
        double kIn = 2;
        double expected = 1.38;
        double out = SqArea.square(pIn, kIn);
        Assert.assertEquals(expected, out, 0.01);
    }
}