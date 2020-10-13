package com.willgibson.adventofcode2019javalearningexercise.day01part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FuelCounterUpperTests {

    private FuelCounterUpper fuelCounterUpper;

    @BeforeEach
    void initUseCase() {
        fuelCounterUpper = new FuelCounterUpper();
    }

    @Test
    void calculate_With12_Returns2() {
        int[] stars = {12};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void calculate_With14_Returns2() {
        int[] stars = {14};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void calculate_With1969_Returns654() {
        int[] stars = {1969};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(654);
    }

    @Test
    void calculate_With100756_Returns33583() {
        int[] stars = {100756};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(33583);
    }

    @Test
    void calculate_With12_14_1969_And_100756_Returns34241() {
        int[] stars = {12, 14, 1969, 100756};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(34241);
    }
}
