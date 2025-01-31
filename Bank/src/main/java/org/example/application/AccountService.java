package org.example.application;


import org.example.Entiter.Account;

public class AccountService {
    private final Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public void deposit(int amount) {
        account.deposit(amount);
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    public void printStatement() {
        account.printStatement();
    }
}
