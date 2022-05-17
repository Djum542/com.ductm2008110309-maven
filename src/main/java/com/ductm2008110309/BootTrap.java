package com.ductm2008110309;

import java.util.Scanner;
import java.util.logging.Handler;

public class BootTrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        UITerminal uiTerminal = new UITerminal(account);
        System.out.println("Welcome to the cinema Reservation System(CRS)!\n (To exit type exitsts)");
        while (true) {
            String displayOpition;
            String rep = scanner.nextLine();
            Thread.sleep(3000);
            uiTerminal.displayOpition();
            // chon
            System.out.println(uiTerminal.getPromt());
            String cmd = handleCommand(rep);
            if (cmd != null && !cmd.equals("Unkown command")) {
                System.out.println(cmd);
                scanner.nextLine();
                UITerminal.handlerInput();
            }
        }

    }

}
