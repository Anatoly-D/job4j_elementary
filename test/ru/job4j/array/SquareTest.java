package ru.job4j.array;

import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then014() {
        int bound = 5;
        int[] actualResult = Square.calculate(bound);
        int[] expectedResult = new int[]{0, 1, 4, 9, 16};
        assertThat(actualResult, is(expectedResult));
    }

}