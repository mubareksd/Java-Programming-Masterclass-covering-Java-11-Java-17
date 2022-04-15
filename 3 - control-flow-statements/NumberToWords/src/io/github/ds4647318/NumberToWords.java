package io.github.ds4647318;

public class NumberToWords {

    public static void numberToWords(int number) {

        int reversed = reverse(number);
        int originalNumberDigits = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < originalNumberDigits; i++) {

            int digit = reversed % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;

        }

    }

    public static int reverse(int number) {
        
        int reversedNumber = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber;

    }

    public static int getDigitCount(int number) {
        
        int sum = 0;
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            sum = 1;
        }

        while (number > 0) {

            int lastDigit = number % 10;
            number /= 10;
            sum++;

        }

        return sum;

    }

}
