package lf.dev.basic.bankaccount.test;

import lf.dev.basic.bankaccount.domain.AccountTerminal;

import java.util.Locale;
import java.util.Scanner;

public class AccountTerminalTest {
    public static void main(String[] args) {
        AccountTerminal account = new AccountTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        account.setName(scanner.nextLine());

        System.out.println("Insert your account number: ");
        account.setNumber(scanner.nextInt());

        System.out.println("Insert the agency: ");
        account.setAgency(scanner.next());

        System.out.println("Insert the deposit amount: ");
        account.setAmount(scanner.nextDouble());

        scanner.close();
        account.showAccount();



    }
}
