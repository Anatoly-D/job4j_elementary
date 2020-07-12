package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenAllOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 3;

        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenAZero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 2;

        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenCZero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;

        int expected = 2;

        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }

    @Test
    public void whenXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int expected = 1;

        int out = X2.calc(a, b, c, x);
        assertThat(out, is(expected));
    }
}