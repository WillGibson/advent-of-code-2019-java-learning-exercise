package com.willgibson.adventofcode2019.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandPreparerTests {

    private CommandPreparer commandPreparer;

    @BeforeEach
    void initUseCase() {
        commandPreparer = new CommandPreparer();
    }

    @Test
    void replaceNounAndVerb_With1_0_0_3_2_3_11_0_99_30_40_50And3And6_Returns1_3_6_3_2_3_11_0_99_30_40_50() throws Exception {
        String commands = "1,0,0,3,2,3,11,0,99,30,40,50";
        String expected = "1,3,6,3,2,3,11,0,99,30,40,50";

        String actual = commandPreparer.replaceNounAndVerb(commands, 3, 6);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void replaceNounAndVerb_With1_0_0_3_2_3_11_0_99_30_40_50And32And56_Returns1_32_56_3_2_3_11_0_99_30_40_50() throws Exception {
        String commands = "1,0,0,3,2,3,11,0,99,30,40,50";
        String expected = "1,32,56,3,2,3,11,0,99,30,40,50";

        String actual = commandPreparer.replaceNounAndVerb(commands, 32, 56);

        assertThat(actual).isEqualTo(expected);
    }
}
