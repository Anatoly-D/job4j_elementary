package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when4and7and5Then7() {
        assertThat(Max.max(4, 7, 5), is(7));
    }

    @Test
    public void when4and7and16and5Then16() {
        assertThat(Max.max(4, 7, 16, 5), is(16));
    }
}