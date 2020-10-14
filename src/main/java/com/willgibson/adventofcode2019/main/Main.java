package com.willgibson.adventofcode2019.main;

import com.willgibson.adventofcode2019.common.input.FromTextFile;
import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart1;
import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private static final String pathToBasePackage = "src/main/java/com/willgibson/adventofcode2019/";

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws FileNotFoundException {
        FromTextFile fromTextFile = new FromTextFile();
        FuelCounterUpperPart1 fuelCounterUpperPart1 = new FuelCounterUpperPart1();
        FuelCounterUpperPart2 fuelCounterUpperPart2 = new FuelCounterUpperPart2();

        int[] stars = fromTextFile.integerPerLineToArray(
            pathToBasePackage + "day01/inputData.txt"
        );
        log.info("Day 01, Part 1 - The fuel required is " + fuelCounterUpperPart1.calculate(stars));
        log.info("Day 01, Part 2 - The fuel required is " + fuelCounterUpperPart2.calculate(stars));
    }
}
