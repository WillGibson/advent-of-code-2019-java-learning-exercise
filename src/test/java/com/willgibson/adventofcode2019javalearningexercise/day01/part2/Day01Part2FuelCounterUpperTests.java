package com.willgibson.adventofcode2019javalearningexercise.day01.part2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Day01Part2FuelCounterUpperTests {

    private FuelCounterUpper fuelCounterUpper;

    @BeforeEach
    void initUseCase() {
        fuelCounterUpper = new FuelCounterUpper();
    }

    @Test
    void calculate_With14_Returns2() {
        int[] stars = {14};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void calculate_With1969_Returns966() {
        int[] stars = {1969};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(966);
    }

    @Test
    void calculate_With100756_Returns50346() {
        int[] stars = {100756};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(50346);
    }

    @Test
    void calculate_With14_1969_And_100756_Returns34241() {
        int[] stars = {14, 1969, 100756};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(85555);
    }
}
