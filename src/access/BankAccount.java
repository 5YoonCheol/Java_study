package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance-amount >= 0){
            balance -= amount;
        } else {
            System.out.println("Invalid amount or 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
