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
    public void should_return_Fizz_when_say_3() {
        //given
        int input = 3;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.FIZZ, result);
    }

    @Test
    public void should_return_Buzz_when_say_5() {
        //given
        int input = 5;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.BUZZ, result);
    }

    @Test
    public void should_return_Whizz_when_say_7() {
        //given
        int input = 7;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(FizzBuzz.WHIZZ, result);
    }

    @Test
    public void should_return_2_when_say_2() {
        //given
        int input = 2;

        //when
        String result = this.fizzBuzz.say(input);

        //then
        assertEquals(Integer.toString(input), result);
    }
}
