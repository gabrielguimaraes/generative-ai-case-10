package com.gabrielguimaraes.usecase10;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StringValidatorTest {

    @ParameterizedTest
    @MethodSource("provideStringsForValidation")
    void testIsValid(String input, int maxLength, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, StringValidator.isValid(input, maxLength));
    }

    private static Stream<Arguments> provideStringsForValidation() {
        return Stream.of(
            // Too short input.
            Arguments.of("", 10, false),

            // Too long input.
            Arguments.of("Aa1!Aa1!Aa1!Aa1!", 10, false),

            // Matching input length.
            Arguments.of("Aa1!", 4, true),

            // Missing uppercase.
            Arguments.of("aa1!", 10, false),

            // Missing lowercase.
            Arguments.of("AA1!", 10, false),

            // Missing special character.
            Arguments.of("Aa1Aa1", 10, false),

            // Missing digit.
            Arguments.of("Aa!Aa!", 10, false),

            // With excess whitespace characters.
            // At the beginning.
            Arguments.of(" Aa1!", 10, false),
            // In the middle.
            Arguments.of("Aa 1!", 10, false),
            // At the end.
            Arguments.of("Aa1! ", 10, false),

            // Happy path.
            Arguments.of("Aa1!", 10, true),

            // Edge case with the entire set of special characters.
            Arguments.of("Aa1!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~", 50, true),

            // Another edge case with special characters escape situations.
            Arguments.of("Aa1[]^", 10, true),
            // Testing with additional special characters.
            // Backslash
            Arguments.of("Aa1\\", 10, true),
            // Curly braces
            Arguments.of("Aa1{}", 10, true),
            // Angle brackets
            Arguments.of("Aa1<>", 10, true)
        );
    }
}
