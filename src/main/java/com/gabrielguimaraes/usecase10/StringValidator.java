package com.gabrielguimaraes.usecase10;

public class StringValidator {

    private StringValidator() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Determines if a given string meets specific validation criteria.
     *
     * <p>The regular expression works as follows:</p>
     * <ul>
     *     <li><b>^</b>: Marks the start of the string.</li>
     *     <li><b>(?!.*\s)</b>: Negative lookahead to ensure the string doesn't contain any whitespace characters.</li>
     *     <li><b>(?=.*[A-Z])</b>: Positive lookahead to ensure at least one uppercase letter exists in the string.</li>
     *     <li><b>(?=.*[a-z])</b>: Positive lookahead to ensure at least one lowercase letter exists in the string.</li>
     *     <li><b>(?=.*\d)</b>: Positive lookahead to ensure at least one digit exists in the string.</li>
     *     <li><b>(?=.*[!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~])</b>: Positive lookahead to ensure at least one special character from the predefined list exists in the string.</li>
     *     <li><b>.{1,maxLength}</b>: Ensures the string length is between 1 and the given maxLength (inclusive).</li>
     *     <li><b>$</b>: Marks the end of the string.</li>
     * </ul>
     *
     * @param input     The string to be validated.
     * @param maxLength The maximum acceptable length of the string.
     * @return {@code true} if the input string matches the criteria, {@code false} otherwise.
     */
    private static final String WHITESPACE_REGEX = ".*\\s.*+";
    private static final String UPPERCASE_REGEX = ".*[A-Z].*+";
    private static final String LOWERCASE_REGEX = ".*[a-z].*+";
    private static final String DIGIT_REGEX = ".*\\d.*+";
    private static final String SPECIAL_CHAR_REGEX = ".*[!\"#$%&'()*+,-./:;<=>?@\\[\\]\\\\^_`{|}~].*+";

    public static boolean isValid(String input, int maxLength) {
        return
            !input.isEmpty() && input.length() <= maxLength &&
                !input.matches(WHITESPACE_REGEX) &&
                input.matches(UPPERCASE_REGEX) &&
                input.matches(LOWERCASE_REGEX) &&
                input.matches(DIGIT_REGEX) &&
                input.matches(SPECIAL_CHAR_REGEX);
    }
}

