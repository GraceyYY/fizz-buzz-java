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
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(input);
        String result = applyRuleForMultipleOfSpecialNumbers(fizzBuzzNumber);

        if (fizzBuzzNumber.containsNumber("7")) {
                result = result.replace(FizzBuzz.BUZZ, "");
            if (fizzBuzzNumber.containsNumber("3")) {
                result = FizzBuzz.FIZZ;
            }
        } else if (fizzBuzzNumber.containsNumber("5")) {
                result = result.replace(FizzBuzz.FIZZ, "");
        } else if (fizzBuzzNumber.containsNumber("3")) {
            result = FizzBuzz.FIZZ;
        }
        return result;
    }

    private String applyRuleForMultipleOfSpecialNumbers(FizzBuzzNumber input) {

        String result = "";

        if (input.isMultipleOf(3)) {
            result += FizzBuzz.FIZZ;
        }
        if (input.isMultipleOf(5)) {
            result += FizzBuzz.BUZZ;
        }
        if (input.isMultipleOf(7)) {
            result += FizzBuzz.WHIZZ;
        }
        if (result.isEmpty()) {
            result = input.getNumInStr();
        }
        return result;
    }

}
