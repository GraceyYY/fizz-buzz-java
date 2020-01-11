package com.thoughtworks;

public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";
    public static String FIZZBUZZ = FIZZ + BUZZ;
    public static String BUZZWHIZZ = BUZZ + WHIZZ;
    public static String FIZZWHIZZ = FIZZ + WHIZZ;
    public static String FIZZBUZZWHIZZ = FIZZ + BUZZ + WHIZZ;

    public String say(int input) {
        String inputStr = Integer.toString(input);
        String result = applyRuleForMultipleOfSpecialNumbers(input);

        if (inputStr.contains("7")) {
                result = result.replace(FizzBuzz.BUZZ, "");
            if (inputStr.contains("3")) {
                result = FizzBuzz.FIZZ;
            }
        } else if (inputStr.contains("5")) {
                result = result.replace(FizzBuzz.FIZZ, "");
        } else if (inputStr.contains("3")) {
            result = FizzBuzz.FIZZ;
        }
        return result;
    }

    private String applyRuleForMultipleOfSpecialNumbers(int input) {
        String result = "";

        if (input % 3 == 0) {
            result += FizzBuzz.FIZZ;
        }
        if (input % 5 == 0) {
            result += FizzBuzz.BUZZ;
        }
        if (input % 7 == 0) {
            result += FizzBuzz.WHIZZ;
        }
        if (result.isEmpty()) {
            result = Integer.toString(input);
        }
        return result;
    }
}
