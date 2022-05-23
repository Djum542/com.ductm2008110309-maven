package main.java.com.ductm2008110309;

import com.ductm2008110309.Account;

public class Createccount {
    private Account account;

    public Createccount(Account account) {
        this.account = account;
    }

    public static Account createAccountInputs() {
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        Integer password = scanner.nextInt();
        scanner.nextLine();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();
        return new Account(username, password, email);
    }

    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = cmd;

        if (this.command.equals("CA")) {
            return "Enter an username, a password, a email";
        } else {
            return "unknown command.";
        }

    }

    public void handleInputs() {

        if (this.command.equals("CA")) {
            Account account = createAccountInputs();

            this.createAccount(account.getUsername(), account.getPassword(), account.getEmail());
        }

    }

    public Account getAccount() {
        return account;
    }
}
