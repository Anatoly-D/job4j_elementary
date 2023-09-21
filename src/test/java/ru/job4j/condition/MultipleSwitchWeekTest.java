package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenTuesdayThen2() {
        String dayEn = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(dayEn);
        int expected = 2;
        assertThat(result).isEqualTo(expected);

    }

    @Test
        void whenTuesdayRuThen2() {
            String dayRus = "Вторник";
            int result = MultipleSwitchWeek.numberOfDay(dayRus);
            int expected = 2;
            assertThat(result).isEqualTo(expected);

        }
}