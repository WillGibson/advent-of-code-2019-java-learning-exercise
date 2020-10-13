package com.willgibson.adventofcode2019javalearningexercise.day01;

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
    void fuelCounterUpper_With12_Returns2() {
        int[] stars = {12};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }

    @Test
    void fuelCounterUpper_With14_Returns2() {
        int[] stars = {14};
        assertThat(fuelCounterUpper.calculate(stars)).isEqualTo(2);
    }
}
