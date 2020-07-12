package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void when560rublesThenTo7EUR() {
        int in = 560;
        int expected = 7;
        int out = Converter.rublesToEUR(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when560rublesThenTo8USD() {
        int in = 560;
        int expected = 8;
        int out = Converter.rublesToUSD(in);
        Assert.assertEquals(expected, out);
    }
}