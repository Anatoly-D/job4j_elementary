package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                is(2)
        );
    }

    @Test
    public void when2Min() {
        assertThat(Min.findMin(new int[]{34, 54, 4, 5, 6, 7, 8, 2, 34, 5, 65, 7, 4}), is(2));
    }

}