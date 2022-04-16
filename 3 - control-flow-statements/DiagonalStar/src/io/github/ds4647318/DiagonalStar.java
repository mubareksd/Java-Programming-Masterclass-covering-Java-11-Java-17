package io.github.ds4647318;

public class DiagonalStar {

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            System.out.println();
            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= number; j++) {
                    if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == j) || (i + j == number + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

        }

    }

}
