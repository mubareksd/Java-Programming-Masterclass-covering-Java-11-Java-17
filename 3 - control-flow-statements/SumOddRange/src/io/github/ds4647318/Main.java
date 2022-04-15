package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {

        System.out.println(SumOddRange.sumOdd(1, 100) + " = 2500");
        System.out.println(SumOddRange.sumOdd(-1, 100) + " = -1");
        System.out.println(SumOddRange.sumOdd(100, 100) + " = 0");
        System.out.println(SumOddRange.sumOdd(13, 13) + " = 13");
        System.out.println(SumOddRange.sumOdd(100, -100) + " = -1");
        System.out.println(SumOddRange.sumOdd(100, 1000) + " = 247500");

    }
}
