package io.github.ds4647318;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        int number = 0;
        while(true) {
            System.out.println("Enter the number:");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum = sum + number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        int avg = (int) Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg + "");
        scanner.close();
    }

}
