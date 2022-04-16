package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("1234", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(100.0);

        bobsAccount.depositFunds(51.0);
        bobsAccount.withdrawFunds(100.0);

    }
}
