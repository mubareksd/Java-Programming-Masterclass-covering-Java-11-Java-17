package io.github.ds4647318;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int firstDigit = 0;
        int lastDigit = 0;


        if (number < 0) {
            return -1;
        }

        lastDigit = number % 10;
        while (number > 0) {
            firstDigit = firstDigit * 10 + number % 10;
            number = number / 10;
        }

        firstDigit %= 10;
        sum = firstDigit + lastDigit;

        return sum;
    }

}
