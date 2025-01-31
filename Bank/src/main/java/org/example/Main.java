package org.example;

import org.example.Entiter.Account;
import org.example.application.AccountService;
import org.example.infrastructure.Clock;
import org.example.infrastructure.StatementPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        StatementPrinter printer = new StatementPrinter();
        Account account = new Account(clock, printer);
        AccountService service = new AccountService(account);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BIENVENUE DANS VOTRE BANQUE ===");

        while (true) {
            System.out.println("\n1. Déposer de l'argent");
            System.out.println("2. Retirer de l'argent");
            System.out.println("3. Afficher le relevé bancaire");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Montant à déposer : ");
                    int depositAmount = scanner.nextInt();
                    service.deposit(depositAmount);
                    System.out.println("Dépôt effectué !");
                    break;
                case 2:
                    System.out.print("Montant à retirer : ");
                    int withdrawAmount = scanner.nextInt();
                    service.withdraw(withdrawAmount);
                    System.out.println("Retrait effectué !");
                    break;
                case 3:
                    service.printStatement();
                    break;
                case 4:
                    System.out.println("Merci d'utiliser notre service !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
