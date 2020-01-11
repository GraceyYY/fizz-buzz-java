package com.thoughtworks;

public class FizzBuzzNumber {
    private int num;

    public FizzBuzzNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    public String getNumInStr() {
        return Integer.toString(this.num);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isMultipleOf(int multiple) {
        return this.num % multiple == 0;
    }

    public boolean containsNumber(String num) {
        return getNumInStr().contains(num);
    }
}
