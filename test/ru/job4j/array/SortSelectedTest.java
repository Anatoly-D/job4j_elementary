package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort30() {
        int[] input = new int[] {90, 0, 98, 16, 64, 88, 36, 87, 58, 28, 44, 56, 86, 72, 85, 39, 1, 98, 19, 83, 35, 38, 90, 14, 77, 78, 49, 61, 4, 88};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 4, 14, 16, 19, 28, 35, 36, 38, 39, 44, 49, 56, 58, 61, 64, 72, 77, 78, 83, 85, 86, 87, 88, 88, 90, 90, 98, 98};
        assertThat(result, is(expect));
    }
}