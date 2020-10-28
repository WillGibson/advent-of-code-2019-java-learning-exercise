package com.willgibson.adventofcode2019.common.input;

import com.willgibson.adventofcode2019.config.Config;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class FromTextFileTests {

    @Test
    void contentToString() throws IOException {
        FromTextFile fromTextFile = new FromTextFile();
        String expected = "Ere be some content";

        String actual = fromTextFile.contentToString(
            Config.pathToTestBasePackage + "common/input/assets/contentToStringInputFile.txt"
        );

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerPerLineToArray_With12_14_1969_And_100756_Returns12_14_1969_And_100756() throws FileNotFoundException {
        FromTextFile fromTextFile = new FromTextFile();
        int[] expected = {12, 14, 1969, 100756};

        int[] actual = fromTextFile.integerPerLineToArray(
            Config.pathToTestBasePackage + "common/input/assets/integerPerLineToArrayInputFile.txt"
        );

        assertThat(actual).isEqualTo(expected);
    }
}
