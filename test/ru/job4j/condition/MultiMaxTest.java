package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int expected = 6;
        int actual = MultiMax.max(6, 1, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSecondMax() {
        int expected = 9;
        int actual = MultiMax.max(6, 9, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void whenThirdMax() {
        int expected = 67;
        int actual = MultiMax.max(6, 1, 67);
        assertEquals(expected, actual);
    }

    @Test
    public void whenAllEqual() {
        int expected = 8;
        int actual = MultiMax.max(8, 8, 8);
        assertEquals(expected, actual);
    }
}