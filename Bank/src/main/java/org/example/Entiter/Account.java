package org.example.Entiter;

import org.example.Entiter.Transaction;
import org.example.infrastructure.Clock;
import org.example.infrastructure.StatementPrinter;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Transaction> transactions = new ArrayList<>();
    private final Clock clock;
    private final StatementPrinter statementPrinter;

    public Account(Clock clock, StatementPrinter statementPrinter) {
        this.clock = clock;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount) {
        transactions.add(new Transaction(clock.today(), amount));
    }

    public void withdraw(int amount) {
        transactions.add(new Transaction(clock.today(), -amount));
    }

    public void printStatement() {
        statementPrinter.print(transactions);
    }
}
