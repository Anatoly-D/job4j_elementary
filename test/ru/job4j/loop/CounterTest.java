package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromFiveToEightThenFourteen() {
        int rsl = Counter.sumByEven(5, 8);
        int expected = 14;
        assertThat(rsl, is(expected));
    }

}