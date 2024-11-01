package enskapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount briantarigan = new BankAccount(100);

        //beli minuman 10
        briantarigan.withdraw(10);
        System.out.println("Current balance is: " +briantarigan.getBalance());
    }
}