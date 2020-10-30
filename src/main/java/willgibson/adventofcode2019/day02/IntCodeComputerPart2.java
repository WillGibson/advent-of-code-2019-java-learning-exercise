package willgibson.adventofcode2019.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntCodeComputerPart2 {

    private static final int addCode = 1;
    private static final int exitCode = 99;
    private static final int multiplyCode = 2;

    private static final List<Integer> allowedOpcodes = Arrays.asList(addCode, exitCode, multiplyCode);

    private int[] memory;

    public String run(String commandString) throws Exception {
        memory = Arrays.stream(commandString.split(",")).mapToInt(Integer::parseInt).toArray();
        this.process(0);
        return Arrays.stream(memory)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(","));
    }

    private void process(int instructionPointer) throws Exception {
        int opcode = memory[instructionPointer];
        if (!allowedOpcodes.contains(opcode)) throw new Exception("Unknown opcode");
        if (opcode != exitCode) {
            int targetAddress = memory[instructionPointer + 3];
            int value1 = memory[memory[instructionPointer + 1]];
            int value2 = memory[memory[instructionPointer + 2]];
            if (opcode == addCode) memory[targetAddress] = value1 + value2;
            else memory[targetAddress] = value1 * value2;
            process(instructionPointer + 4);
        }
    }
}
