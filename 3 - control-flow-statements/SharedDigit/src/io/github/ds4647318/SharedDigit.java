package io.github.ds4647318;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        a /= 10;
        b /= 10;
        int aFirstDigit = a;
        int bFirstDigit = b;

        return ((aFirstDigit == bFirstDigit) || (aFirstDigit == bLastDigit) || (aLastDigit == bFirstDigit) || (aLastDigit == bLastDigit));
    }

}
