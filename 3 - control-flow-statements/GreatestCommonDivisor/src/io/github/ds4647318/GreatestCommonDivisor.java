package io.github.ds4647318;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int smallerNumber = Math.min(first,second);

            for (int i = smallerNumber; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        }

        return -1;

    }

}
