package com.willgibson.adventofcode2019.common.input;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

class FromTextFileTests {

    @Test
    void integerPerLineToArray_With12_14_1969_And_100756_Returns12_14_1969_And_100756() throws FileNotFoundException {
        FromTextFile fromTextFile = new FromTextFile();
        int[] expected = {12, 14, 1969, 100756};

        int[] actual = fromTextFile.integerPerLineToArray(
            "src/test/java/com/willgibson/adventofcode2019/common/input/assets/integerPerLineToArrayInputFile.txt"
        );

        assertThat(actual).isEqualTo(expected);
    }
}
