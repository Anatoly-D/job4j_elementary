package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0011then2() {
        Point first = new Point(1, 3);
        Point second = new Point(4, 6);

        double expectedResult = 4.2;
        double result = first.distance(second);

        Assert.assertEquals(expectedResult, result, 0.2);

    }

}