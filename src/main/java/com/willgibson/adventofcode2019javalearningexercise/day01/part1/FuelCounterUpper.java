package com.willgibson.adventofcode2019javalearningexercise.day01.part1;

import com.willgibson.adventofcode2019javalearningexercise.common.input.FromTextFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.util.Arrays;

@SpringBootApplication
public class FuelCounterUpper implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(FuelCounterUpper.class);

    public static void main(String[] args) {
        SpringApplication.run(FuelCounterUpper.class, args);
    }

    @Override
    public void run(String... args) throws FileNotFoundException {
        FromTextFile fromTextFile = new FromTextFile();
        int[] stars = fromTextFile.integerPerLineToArray(
            "src/main/java/com/willgibson/adventofcode2019javalearningexercise/day01/inputData.txt"
        );
        LOG.info("Day 01, Part 1 - The fuel required is " + calculate(stars));
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
