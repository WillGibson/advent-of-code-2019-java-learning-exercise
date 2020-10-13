package com.willgibson.adventofcode2019javalearningexercise.day01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class FuelCounterUpper implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(FuelCounterUpper.class);

    public static void main(String[] args) {
        SpringApplication.run(FuelCounterUpper.class, args);
    }

    @Override
    public void run(String... args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(
            "src/main/java/com/willgibson/adventofcode2019javalearningexercise/day01/inputData.txt"
        ));
        int[] stars = putInputDataIntoArray(scanner, new int[]{});
        LOG.info("The fuel required is " + calculate(stars));
    }

    private int[] putInputDataIntoArray(Scanner scanner, int[] starsSoFar) {
        if (!scanner.hasNext()) return starsSoFar;
        else {
            int numberOfStarsSoFar = starsSoFar.length;
            int[] newStarsArray = new int[numberOfStarsSoFar + 1];
            for (int i = 0; i < numberOfStarsSoFar; i++) newStarsArray[i] = starsSoFar[i];
            newStarsArray[numberOfStarsSoFar] = scanner.nextInt();
            return putInputDataIntoArray(scanner, newStarsArray);
        }
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
