package com.ductm2008110309;

import java.util.Scanner;

public class UITerminal {
    private Account account;
    private String promt;// thông báo
    private String command;
    private static Scanner scanner = new Scanner(System.in);

    public void displayOpition() {
        System.out.println("---------------Menu-------------");
if (!account.checkLoggedin()) {
this.promt =     "Enter on ò the commant in the account\n" + "[CA]Create account\n"+"[li] loggnin"
} else {
    this.promt = "[Login is as #]"+account.get
}
    }

    public UITerminal(Account account) {
        this.account = account;
    }

    public String handleCommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = cmd;
        if (command.equals("CA")) {
            return "Enter an username, a password, a email";
        } else if (this.command.equals(LI)) {
            return "Enter a username, a password";

        } else if (this.command.equals("LO")) {
            return "Logout ";

        } else {
            return " Unkwon command";
        }
public void handlerInput() {
    if (this.command.equals("CA")) {
        Account account = createAccountInput();

    } else {
        
    }
    public void createAccountInput() {
        System.out.println("Username");
        String username = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine(); 
        System.out.println("email");
        String email = scanner.nextLine();
    }
}
    }

    private Account createAccountInput() {
        return null;
    }

    private void handlerInput() {
    }
}
