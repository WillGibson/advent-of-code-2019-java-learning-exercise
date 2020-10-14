package com.willgibson.adventofcode2019javalearningexercise.day01;

import java.util.Arrays;

public class FuelCounterUpperPart1 {

    public int calculate(int[] stars) {
        return iterate(stars, 0);
    }

    private int fuelNeeded(int star) {
        return ((star / 3) - 2);
    }

    private int iterate(int[] stars, int accumulator) {
        if (stars.length == 0) return accumulator;
        else {
            return iterate(
                Arrays.copyOfRange(stars, 1, stars.length),
                (accumulator + fuelNeeded(stars[0]))
            );
        }
    }
}
