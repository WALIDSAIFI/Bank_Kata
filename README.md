# Bank Kata - Projet Java Console 🏦

## 📌 Description
Ce projet est une implémentation en **Java Console** d'un système simple de gestion de compte bancaire.  
L'utilisateur peut **déposer**, **retirer** de l'argent et **afficher le relevé bancaire**.

L'architecture suit le modèle **Hexagonal (Ports & Adapters)**, ce qui assure une séparation claire des responsabilités.

---

## 🚀 **Fonctionnalités**
- 📥 **Dépôt** d'argent.
- 💸 **Retrait** d'argent.
- 📜 **Affichage du relevé bancaire** avec la liste des transactions.
- 🕒 **Gestion des dates** avec `Clock.java`.
- ✅ **Tests unitaires** avec JUnit et Mockito.

---

## 🏗️ **Architecture du Projet**

/bank-kata
│── src/
│   ├── main/java/com/example/bankkata/
│   │   ├── domain/             
│   │   │   ├── Account.java
│   │   │   ├── Transaction.java
│   │   ├── application/       
│   │   │   ├── AccountService.java
│   │   ├── infrastructure/      
│   │   │   ├── StatementPrinter.java
│   │   │   ├── Clock.java
│   │   ├── Main.java             
│   ├── test/java/com/example/bankkata/
│   │   ├── AccountTest.java
│   │   ├── StatementPrinterTest.java
│   │   ├── ClockTest.java




---

## 💻 **Technologies Utilisées**
- **Java 17+** 🏗️
- **JUnit 5** (Tests unitaires) 🧪
- **Mockito** (Mocking pour les tests) 🎭
- **Java Console** (Interaction utilisateur) ⌨️

---

