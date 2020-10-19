package com.willgibson.adventofcode2019.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntCodeComputerPart2 {

    private static final int addCode = 1;
    private static final int exitCode = 99;
    private static final int multiplyCode = 2;

    private static final List<Integer> allowedOpcodes = Arrays.asList(addCode, exitCode, multiplyCode);

    public String run(String commandString) throws Exception {
        int[] commands = Arrays.stream(commandString.split(",")).mapToInt(Integer::parseInt).toArray();
        int[] processedCommands = this.process(commands, 0);
        return Arrays.stream(processedCommands)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(","));
    }

    private int[] process(int[] commands, int pointer) throws Exception {
        int opcode = commands[pointer];
        if (!allowedOpcodes.contains(opcode)) throw new Exception("Unknown opcode");
        if (opcode != exitCode) {
            int targetElement = commands[pointer + 3];
            int value1 = commands[commands[pointer + 1]];
            int value2 = commands[commands[pointer + 2]];
            if (opcode == addCode) commands[targetElement] = value1 + value2;
            else commands[targetElement] = value1 * value2;
            process(commands, pointer + 4);
        }
        return commands;
    }
}
