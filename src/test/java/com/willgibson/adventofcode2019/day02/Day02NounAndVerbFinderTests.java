package com.willgibson.adventofcode2019.day02;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day02NounAndVerbFinderTests {

    private IntCodeComputerPart2 intCodeComputer;
    private NounAndVerbFinder nounAndVerbFinder;

    @BeforeEach
    void initUseCase() {
        intCodeComputer = new IntCodeComputerPart2();
        nounAndVerbFinder = new NounAndVerbFinder(intCodeComputer);
    }

    @Test
    void run_With1_0_0_3_2_3_11_0_99_30_40_50And3500_Returns910() throws Exception {
        String commands = "1,0,0,3,2,3,11,0,99,30,40,50";
        int target = 3500;
        int expected = 910;

        int actual = nounAndVerbFinder.find(commands, target);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void run_With1_0_0_3_2_3_11_0_99_30_40_50_1_1_1_1_1_1_1_1_1_1And2550_Returns1006() throws Exception {
        String commands = "1,0,0,3,2,3,11,0,99,30,40,50,1,1,1,1,1,1,1,1,1,1";
        int target = 1650;
        int expected = 309;

        int actual = nounAndVerbFinder.find(commands, target);

        assertThat(actual).isEqualTo(expected);
    }
}
