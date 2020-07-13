package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int factorialNumber = 5;
        int expectedResult = 120;
        int actualResult = Factorial.calc(factorialNumber);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int factorialNumber = 0;
        int expectedResult = 1;
        int actualResult = Factorial.calc(factorialNumber);
        Assert.assertEquals(expectedResult, actualResult);
    }

}