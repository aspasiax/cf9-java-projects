package gr.aueb.cf.cf9.part2oop.ch18.bankapp;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.controller.AccountController;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * The Entry Point of the Banking Application.
 * This class is responsible for wiring the application components (DAO, Service, Controller)
 * and providing a Console User Interface (UI) for interaction.
 */
public class Main {

    // Wiring Dependencies (Top-Down Approach)
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static AccountController accountController = new AccountController(accountService);

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;
        String iban;

        while (true) {
            printMenu();
            option = scanner.nextLine().trim();

            try {
                switch (option) {
                    case "1" -> {
                        System.out.println("Please enter IBAN:");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter initial balance:");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("Success! Account created with IBAN: " +
                                readOnlyDTO.iban() + " and balance: " + readOnlyDTO.balance());
                    }
                    case "2" -> {
                        System.out.print("Please enter IBAN: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter deposit amount:");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.deposit(iban, depositAmount);
                        System.out.println("Deposit successful: " + depositAmount + ". New Balance: " +
                                accountController.getBalance(iban));
                    }
                    case "3" -> {
                        System.out.print("Please enter IBAN: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Please enter withdraw amount:");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Withdrawal successful: " + withdrawAmount + ". New Balance: " +
                                accountController.getBalance(iban));
                    }
                    case "4" -> {
                        System.out.print("Please enter IBAN: ");
                        iban = scanner.nextLine().trim();

                        BigDecimal balance = accountController.getBalance(iban);
                        System.out.println("Account Balance: " + balance);
                    }
                    case "5" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOs = accountController.getAllAccounts();

                        if (readOnlyDTOs.isEmpty()) {
                            System.out.println("No accounts found.");
                        } else {
                            System.out.println("--- All Accounts ---");
                            readOnlyDTOs.forEach(System.out::println);
                        }
                    }
                    case "6" -> {
                        System.out.println("Exiting application. Goodbye!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } catch (AccountNotFoundException e) {
                // Print the specific message from the Service
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } catch (ValidationException e) {
                System.out.println("Validation Error: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                // Catch-all for unexpected errors
                System.out.println("Unknown Error: " + e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Bank App Service ===");
        System.out.println("1. Create (or Update) Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Balance");
        System.out.println("5. View All Accounts");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");
    }
}