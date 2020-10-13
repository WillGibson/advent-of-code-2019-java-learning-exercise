package com.willgibson.adventofcode2019javalearningexercise.day01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FuelCounterUpper {

    public static void main(String[] args) {
        SpringApplication.run(FuelCounterUpper.class, args);
    }

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
