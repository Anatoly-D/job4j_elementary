package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
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

    @Test
    public void when123and425Then3p6() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(4, 2, 5);

        double expectedResult = 3.6;
        Assert.assertEquals(expectedResult, first.distance3d(second), 0.1);
    }
}