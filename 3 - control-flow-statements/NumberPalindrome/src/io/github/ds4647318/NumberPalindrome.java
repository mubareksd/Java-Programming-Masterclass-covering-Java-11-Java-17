package io.github.ds4647318;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        int lastDigit;
        reverse = reverse * 10;

        while (number != 0) {

            // 707 % 10 = 7
            // 70 % 10 = 7
            // 7 % 10 = 7
            lastDigit = number % 10;
            // 0 * 10 + 7 = 7
            // 7 * 10 + 0 = 70
            // 70 * 10 + 7 = 707
            reverse = reverse * 10 + lastDigit;
            // 707 / 10 = 70
            // 70 / 10 = 7
            number /= 10;

        }

        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }

}
