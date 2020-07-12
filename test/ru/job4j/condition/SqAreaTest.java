package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        float p = 6;
        float k = 2;

        double expected = 2;
        double actual = SqArea.square(p, k);

        Assert.assertEquals(expected, actual, 0.05);

    }
}