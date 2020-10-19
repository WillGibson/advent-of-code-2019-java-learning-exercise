package com.willgibson.adventofcode2019.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day02IntCodeComputerPart2Tests {

    private IntCodeComputerPart2 intCodeComputer;

    @BeforeEach
    void initUseCase() {
        intCodeComputer = new IntCodeComputerPart2();
    }

    // Todo: Test for exception

    @Test
    void run_With1_0_0_0_99_Returns2_0_0_0_99() throws Exception {
        String input = "1,0,0,0,99";
        String expected = "2,0,0,0,99";

        String actual = intCodeComputer.run(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void run_With2_3_0_3_99_Returns2_3_0_6_99() throws Exception {
        String input = "2,3,0,3,99";
        String expected = "2,3,0,6,99";

        String actual = intCodeComputer.run(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void run_With2_4_4_5_99_0_Returns2_4_4_5_99_9801() throws Exception {
        String input = "2,4,4,5,99,0";
        String expected = "2,4,4,5,99,9801";

        String actual = intCodeComputer.run(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void run_With1_1_1_4_99_5_6_0_99_Returns30_1_1_4_2_5_6_0_99() throws Exception {
        String input = "1,1,1,4,99,5,6,0,99";
        String expected = "30,1,1,4,2,5,6,0,99";

        String actual = intCodeComputer.run(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void run_With1_9_10_3_2_3_11_0_99_30_40_50_Returns3500_9_10_70_2_3_11_0_99_30_40_50() throws Exception {
        String input = "1,9,10,3,2,3,11,0,99,30,40,50";
        String expected = "3500,9,10,70,2,3,11,0,99,30,40,50";

        String actual = intCodeComputer.run(input);

        assertThat(actual).isEqualTo(expected);
    }
}
