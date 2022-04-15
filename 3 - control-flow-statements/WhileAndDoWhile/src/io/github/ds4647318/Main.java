package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count ++;
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            System.out.println();
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
            sum += number;
        }

        System.out.println("Total even Numbers Found " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
