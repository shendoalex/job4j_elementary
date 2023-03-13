package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1in = 0;
        int y1in = 0;
        int x2in = 2;
        int y2in = 0;
        double expected = 2;
        double out = Point.distance(x1in, y1in, x2in, y2in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        int x1in = 1;
        int y1in = 0;
        int x2in = 2;
        int y2in = 0;
        double expected = 1;
        double out = Point.distance(x1in, y1in, x2in, y2in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to10then2dot23() {
        int x1in = 0;
        int y1in = 2;
        int x2in = 1;
        int y2in = 0;
        double expected = 2.23;
        double out = Point.distance(x1in, y1in, x2in, y2in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1dot41() {
        int x1in = 1;
        int y1in = 1;
        int x2in = 2;
        int y2in = 2;
        double expected = 1.41;
        double out = Point.distance(x1in, y1in, x2in, y2in);
        Assert.assertEquals(expected, out, 0.01);
    }
}