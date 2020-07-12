package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0011then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;

        double expectedResult = 1.4;
        double result = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expectedResult, result, 0.1);

    }

}