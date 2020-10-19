package com.willgibson.adventofcode2019.main;

import com.willgibson.adventofcode2019.Config;
import com.willgibson.adventofcode2019.common.input.FromTextFile;
import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart1;
import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart2;
import com.willgibson.adventofcode2019.day02.IntCodeComputerPart1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private static final FromTextFile fromTextFile = new FromTextFile();
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        day01();
        day02();
    }

    private void day01() throws FileNotFoundException {
        final FuelCounterUpperPart1 fuelCounterUpperPart1 = new FuelCounterUpperPart1();
        final FuelCounterUpperPart2 fuelCounterUpperPart2 = new FuelCounterUpperPart2();
        final int[] stars = fromTextFile.integerPerLineToArray(Config.pathToBasePackage + "day01/input.txt");
        log.info("Day 01, Part 1 - The fuel required is " + fuelCounterUpperPart1.calculate(stars));
        log.info("Day 01, Part 2 - The fuel required is " + fuelCounterUpperPart2.calculate(stars));
    }

    private void day02() throws Exception {
        final IntCodeComputerPart1 intCodeComputer1 = new IntCodeComputerPart1();
        final String commandString = fromTextFile.contentToString(Config.pathToBasePackage + "day02/input.txt");
        // Restore commandString to "1202 program alarm" state - l'il bit manual...
        final String[] commandsArray = commandString.split(",");
        commandsArray[1] = "12";
        commandsArray[2] = "2";
        final String restoredCommands = String.join(",", commandsArray);
        log.info("Day 02, Part 1 - The value at position 0 is " + intCodeComputer1.run(restoredCommands).split(",")[0]);
    }
}
