package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValues = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLongValues);

        short shortTotal = (short) (100 + 10 * (myByteValue + myShortValue + myIntValue));
    }
}
