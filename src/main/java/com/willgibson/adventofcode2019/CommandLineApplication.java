// package com.willgibson.adventofcode2019;
//
// import com.willgibson.adventofcode2019.common.input.FromTextFile;
// import com.willgibson.adventofcode2019.config.Config;
// import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart1;
// import com.willgibson.adventofcode2019.day01.FuelCounterUpperPart2;
// import com.willgibson.adventofcode2019.day02.CommandPreparer;
// import com.willgibson.adventofcode2019.day02.IntCodeComputerPart1;
// import com.willgibson.adventofcode2019.day02.IntCodeComputerPart2;
// import com.willgibson.adventofcode2019.day02.NounAndVerbFinder;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
//
// import java.io.FileNotFoundException;
//
// @SpringBootApplication
// public class CommandLineApplication implements CommandLineRunner {
//
//     private static final FromTextFile fromTextFile = new FromTextFile();
//     private static final Logger log = LoggerFactory.getLogger(CommandLineApplication.class);
//
//     public static void main(String[] args) {
//         SpringApplication.run(CommandLineApplication.class, args);
//     }
//
//     @Override
//     public void run(String... args) throws Exception {
//         day01();
//         day02();
//     }
//
//     private void day01() throws FileNotFoundException {
//         final FuelCounterUpperPart1 fuelCounterUpperPart1 = new FuelCounterUpperPart1();
//         final FuelCounterUpperPart2 fuelCounterUpperPart2 = new FuelCounterUpperPart2();
//         final int[] stars = fromTextFile.integerPerLineToArray(Config.pathToBasePackage + "day01/input.txt");
//         log.info("Day 01, Part 1 - The fuel required is " + fuelCounterUpperPart1.calculate(stars));
//         log.info("Day 01, Part 2 - The fuel required is " + fuelCounterUpperPart2.calculate(stars));
//     }
//
//     private void day02() throws Exception {
//         final IntCodeComputerPart1 intCodeComputer1 = new IntCodeComputerPart1();
//         final IntCodeComputerPart2 intCodeComputer2 = new IntCodeComputerPart2();
//         final String commandString = fromTextFile.contentToString(Config.pathToBasePackage + "day02/input.txt");
//         final String preparedCommands1 = CommandPreparer.replaceNounAndVerb(commandString, 12, 2);
//         log.info(
//             "Day 02, Part 1 - The value at position 0 is " + intCodeComputer1.run(preparedCommands1).split(",")[0]
//         );
//         final String preparedCommands2 = CommandPreparer.replaceNounAndVerb(commandString, 120, 2);
//         final NounAndVerbFinder nounAndVerbFinder = new NounAndVerbFinder(intCodeComputer2);
//         final int target = 19690720;
//         log.info(
//             "Day 02, Part 2 - The noun/verb which produces " + target + " at position 0 is " +
//                 nounAndVerbFinder.find(preparedCommands2, target)
//         );
//     }
// }
