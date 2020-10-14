package com.willgibson.adventofcode2019javalearningexercise.common.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class FromTextFile {

    public int[] integerPerLineToArray(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(filePath));
        return putLineDataIntoArray(scanner, new int[]{});
    }

    private int[] putLineDataIntoArray(Scanner scanner, int[] arraySoFar) {
        if (!scanner.hasNext()) return arraySoFar;
        else {
            int numberOfElementsSoFar = arraySoFar.length;
            int[] newArray = new int[numberOfElementsSoFar + 1];
            for (int i = 0; i < numberOfElementsSoFar; i++) newArray[i] = arraySoFar[i];
            newArray[numberOfElementsSoFar] = scanner.nextInt();
            return putLineDataIntoArray(scanner, newArray);
        }
    }
}
