package org.example.infrastructure;

import org.example.Entiter.Transaction;

import java.util.List;

public class StatementPrinter {
    public void print(List<Transaction> transactions) {
        System.out.println("Date | Montant | Solde");
        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            System.out.println(transaction.getDate() + " | " + transaction.getAmount() + " | " + balance);
        }
    }
}
