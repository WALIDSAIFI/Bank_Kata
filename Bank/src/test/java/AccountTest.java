
import org.example.Entiter.Account;
import org.example.Entiter.Transaction;
import org.example.infrastructure.Clock;
import org.example.infrastructure.StatementPrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class AccountTest {
    private Account account;
    private Clock clock;
    private StatementPrinter statementPrinter;

    @BeforeEach
    void setUp() {
        clock = mock(Clock.class);
        statementPrinter = mock(StatementPrinter.class);
        account = new Account(clock, statementPrinter);
    }

    @Test
    void shouldStoreDepositTransaction() {
        when(clock.today()).thenReturn(LocalDate.of(2025, 1, 31));

        account.deposit(1000);

        ArgumentCaptor<Transaction> captor = ArgumentCaptor.forClass(Transaction.class);
        List<Transaction> transactions = account.getTransactions();

        assertEquals(1, transactions.size());
        assertEquals(1000, transactions.get(0).getAmount());
        assertEquals(LocalDate.of(2025, 1, 31), transactions.get(0).getDate());
    }

    @Test
    void shouldStoreWithdrawalTransaction() {
        when(clock.today()).thenReturn(LocalDate.of(2025, 2, 1));

        account.withdraw(500);

        List<Transaction> transactions = account.getTransactions();
        assertEquals(1, transactions.size());
        assertEquals(-500, transactions.get(0).getAmount());
        assertEquals(LocalDate.of(2025, 2, 1), transactions.get(0).getDate());
    }

    @Test
    void shouldPrintStatementWithAllTransactions() {
        account.printStatement();

        verify(statementPrinter, times(1)).print(anyList());
    }
}
