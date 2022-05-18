package com.ductm2008110309;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private String Password;
    private String Email;
    private Boolean Loggedin;
    private static StoredFiles account = new StoredFiles("account.json");

    public Account() {
        this.name = name;
        this.Password = Password;
        this.Email = Email;
        this.Loggedin = Loggedin;

    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setLoggedin(Boolean loggedin) {
        Loggedin = loggedin;
    }

    public Boolean getLoggedin() {
        return Loggedin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void createAccount(String name, String Passwword, String Email, boolean Loggedin) {

    }

    @Override
    public String toString() {
        return "Account [Email=" + Email + ", Loggedin=" + Loggedin + ", Password=" + Password + ", name=" + name + "]";
    }

    public static void createAccount(String username, String password, String email) {
        // username/email/check
        // ....
        List<Object> list = new ArrayList<>();
        if (!(boolean) list.get(0)) {
            // false
            System.out.println(list.get(1));
        } else {
            // un:
            // ps:
            // email:
            account.update(username, password, email);
            account.write();
        }
    }

    public void Logout() {
        this.Loggedin = false;
        this.name = null;
        this.Password = null;
        this.Email = null;

    }

    public static List<Object> accountValid(String username, String email) {
        List<Object> list = new ArrayList<>();
        int index = 0;
        index = account.search("un", username);
        if (index != -1) {
            list.add(false);
            list.add("[Email exists] an email with that email already");
            return list;
        } else {
            list.add(true);
            list.add("[Account create] an account with that account already");
            return list;
        }
    }
}
