package willgibson.adventofcode2019.OutputData;

import lombok.Getter;
import willgibson.adventofcode2019.common.input.FromTextFile;
import willgibson.adventofcode2019.config.Config;
import willgibson.adventofcode2019.day01.FuelCounterUpperPart1;
import willgibson.adventofcode2019.day01.FuelCounterUpperPart2;
import willgibson.adventofcode2019.day02.CommandPreparer;
import willgibson.adventofcode2019.day02.IntCodeComputerPart1;
import willgibson.adventofcode2019.day02.IntCodeComputerPart2;
import willgibson.adventofcode2019.day02.NounAndVerbFinder;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class DayData {

    @Getter private String heading;
    @Getter private String answerPart1;
    @Getter private String answerPart2;

    @Getter private final String day;

    // Todo: look at whether there's a service container to use for dependency injection
    private static final FromTextFile fromTextFile = new FromTextFile();

    public DayData(String day) {
        this.day = day;
    }

    public DayData generate() {
        try {
            this.getClass().getDeclaredMethod("day" + this.day).invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            this.heading = "Error: Method not created for day " + this.day;
        }
        return this;
    }

    private void day01() throws FileNotFoundException {
        this.heading = "Day 01: The Tyranny of the Rocket Equation";

        final int[] stars = fromTextFile.integerPerLineToArray(Config.pathToBasePackage + "day01/input.txt");

        final FuelCounterUpperPart1 fuelCounterUpperPart1 = new FuelCounterUpperPart1();
        this.answerPart1 = "The fuel required is " + fuelCounterUpperPart1.calculate(stars);

        final FuelCounterUpperPart2 fuelCounterUpperPart2 = new FuelCounterUpperPart2();
        this.answerPart2 = "The fuel required is " + fuelCounterUpperPart2.calculate(stars);
    }

    private void day02() throws Exception {
        this.heading = "Day 02: 1202 Program Alarm";

        final String commandString = fromTextFile.contentToString(Config.pathToBasePackage + "day02/input.txt");

        final IntCodeComputerPart1 intCodeComputer1 = new IntCodeComputerPart1();
        final String preparedCommands1 = CommandPreparer.replaceNounAndVerb(commandString, 12, 2);
        this.answerPart1 = "The value at position 0 is " + intCodeComputer1.run(preparedCommands1).split(",")[0];

        final IntCodeComputerPart2 intCodeComputer2 = new IntCodeComputerPart2();
        final String preparedCommands2 = CommandPreparer.replaceNounAndVerb(commandString, 120, 2);
        final NounAndVerbFinder nounAndVerbFinder = new NounAndVerbFinder(intCodeComputer2);
        final int target = 19690720;
        this.answerPart2 = "The noun/verb which produces " + target + " at position 0 is " +
                nounAndVerbFinder.find(preparedCommands2, target);
    }
}
