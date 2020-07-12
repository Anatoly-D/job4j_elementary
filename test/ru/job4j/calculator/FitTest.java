package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when175ThenmanWeight85() {
        short height = 175;
        double expectedWeight = 86.244;
        double rsl = Fit.manWeight(height);

        Assert.assertEquals(expectedWeight, rsl, 0.01);
    }
}