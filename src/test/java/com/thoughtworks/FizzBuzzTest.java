package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_Fizz_when_say_a_multiple_of_3() {
        //given
        int input = 3;
        int input2 = 6;

        //when
        String result = this.fizzBuzz.say(input);
        String result2 = this.fizzBuzz.say(input2);

        //then
        assertEquals(FizzBuzz.FIZZ, result);
        assertEquals(FizzBuzz.FIZZ, result2);
    }

    @Test
    public void should_return_Buzz_when_say_a_multiple_of_5() {
        //given
        int input = 5;
        int input2 = 10;

        //when
        String result = this.fizzBuzz.say(input);
        String result2 = this.fizzBuzz.say(input2);

        //then
        assertEquals(FizzBuzz.BUZZ, result);
        assertEquals(FizzBuzz.BUZZ, result2);
    }

    @Test
    public void should_return_Whizz_when_say_a_multiple_of_7() {
        //given
        int input = 7;
        int input2 = 14;

        //when
        String result = this.fizzBuzz.say(input);
        String result2 = this.fizzBuzz.say(input2);

        //then
        assertEquals(FizzBuzz.WHIZZ, result);
        assertEquals(FizzBuzz.WHIZZ, result2);
    }

    @Test
    public void should_return_the_number_when_the_number_is_not_a_multiple_of_3_5_7() {
        //given
        int input = 2;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(Integer.toString(input), result);
    }

    @Test
    public void should_return_FizzBuzz_when_say_a_multiple_of_3_and_5() {
        //given
        int input = 15;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.FIZZBUZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_say_a_multiple_of_5_and_7() {
        //given
        int input = 35;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.BUZZWHIZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_say_a_multiple_of_3_and_7() {
        //given
        int input = 21;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.FIZZWHIZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_say_a_multiple_of_3_and_5_and_7() {
        //given
        int input = 3 * 5 * 7;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.FIZZBUZZWHIZZ, result);
    }
}
