package io.github.ds4647318;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account(); // "1234", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawFunds(100.0);
//
//        bobsAccount.depositFunds(50.0);
//        bobsAccount.withdrawFunds(100.0);
//
//        bobsAccount.depositFunds(51.0);
//        bobsAccount.withdrawFunds(100.0);
//
        Account timsAccount = new Account("Tim", "tim@gmail.com", "12345");

        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawFunds(-100.55);

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

    }
}
