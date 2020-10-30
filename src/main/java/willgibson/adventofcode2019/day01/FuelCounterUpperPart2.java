package willgibson.adventofcode2019.day01;

import java.util.Arrays;

public class FuelCounterUpperPart2 {

    public int calculate(int[] stars) {
        return calculateFuelForAllStars(stars, 0);
    }

    private int calculateFuel(int fuel, int accumulator) {
        int fuelNeeded = (fuel / 3) - 2;
        if (fuelNeeded <= 0) return accumulator;
        else {
            return calculateFuel(fuelNeeded, (accumulator + fuelNeeded));
        }
    }

    private int calculateFuelForAllStars(int[] stars, int accumulator) {
        if (stars.length == 0) return accumulator;
        else {
            return calculateFuelForAllStars(
                Arrays.copyOfRange(stars, 1, stars.length),
                (accumulator + calculateFuel(stars[0], 0))
            );
        }
    }
}
