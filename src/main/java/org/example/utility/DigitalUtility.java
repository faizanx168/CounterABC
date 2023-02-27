package org.example.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalUtility {
    private static final String regexForVowel = "[aeiouAEIOU]";
    private static Pattern pattern = Pattern.compile(regexForVowel);
    public static boolean isVowel(String input){
        Matcher matcher = pattern.matcher(input);
        boolean status = matcher.find();
        return status;
    }


}
