package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatException {
    private static int i = 0;
    private static Matcher m;
    private static Pattern GLOBAL_PATTERN = Pattern.compile("[A-Za-z0-9]");

    public static boolean checker(char input) throws Exception {
        i++;
        m = GLOBAL_PATTERN.matcher(Character.toString(input));
        boolean matched = m.find();
        if (!matched) {
            throw new Exception("Error in Input");
        }
        return true;
    }

    public static int returnIntake() {
        return i;
    }
}
