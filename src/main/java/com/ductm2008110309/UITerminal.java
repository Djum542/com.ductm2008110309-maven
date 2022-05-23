package com.ductm2008110309;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Action;

public class UITerminal {

    private static final Object LI = null;
    private static Account account;
    private String promt;// thông báo

    private enum;
    private static Scanner scanner = new Scanner(System.in);

    public void displayOpition() {
        System.out.println("---------------Menu-------------");
        if (!account.getLoggedin()) {
            this.promt = "Enter on of the commant in the account" + "[CA]Create account\n" + "[li] loggnin";
        } else {
            this.promt = "[Login is as #]" + account.getName();
        }
    }

    public UITerminal(Account account) {
        this.account = account;
    }

    public String handleCommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = cmd;
        if (this.command.equals(Action.CA)) {
            return "Enter an username, a password, a email";
        } else if (this.command.equals(LI)) {
            return "Enter a username, a password";

        } else if (this.command.equals("LO")) {
            return "Logout ";

        } else {
            return  "Unkwon command";
        }

    private void handlerInput() {

        if (this.command.equals("CA")) {
            Account account = createAccountInput();
            Account.createAccount(account.getName(), account.getPassword(), account.getEmail());

        } else if (this.command.equals("LI")) {
            List<Object> list = loginInput();// implementations
            Account.Login(list.get(0).toString(), (int) list.get(1));
        } else if (this.command.equals("LO")) {
            account.Logout();
        }
    }

    private List<Object> loginInput() {
        List<Object> list = new ArrayList<>();
        System.out.println("Ussername");
        String name = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();
        list.add(name);
        list.add(Integer.parseInt(name));
        list.add(password);
        return list;

    }

    public Account createAccountInput() {
        System.out.println("Username");
        String username = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
    }

    }

    private Account createAccountInput() {
        return null;
    }

    static void handlerInput() {
    }

    public char[] getPromt() {
        return null;
    }

    public void Login(String name, String passwoed) {
        System.out.println("username");
        String username = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();
    }
}
