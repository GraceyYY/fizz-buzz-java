package com.thoughtworks;

public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";

    public String say(int input) {

        if (input % 3 == 0) {
            return FizzBuzz.FIZZ;
        } else if (input % 5 == 0) {
            return FizzBuzz.BUZZ;
        } else if (input % 7 == 0) {
            return FizzBuzz.WHIZZ;
        } else {
            return Integer.toString(input);
        }
    }

}
