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
        // Todo: Mock intCodeComputer
        intCodeComputer = new IntCodeComputerPart2();
        nounAndVerbFinder = new NounAndVerbFinder(intCodeComputer);
    }

    @Test
    void run_With1_0_0_3_2_3_11_0_99And3500_Returns9And10() throws Exception {
        String commands = "1,0,0,3,2,3,11,0,99";
        int target = 3500;
        int expected = 9010;

        int actual = nounAndVerbFinder.find(commands, target);

        assertThat(actual).isEqualTo(expected);
    }
}
