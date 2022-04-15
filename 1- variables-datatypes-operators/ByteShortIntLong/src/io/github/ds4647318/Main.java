package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        
        int myMaxIntTest = 2_147_483_647;
    }
}
