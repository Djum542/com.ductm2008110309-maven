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

    public void Login(String name, String pasword) {
        // to do
        // un---> search(un, username)
        // Found -->index
        // ps--> check pass by index
        // get email
        // logged
        // Object account (empty) chưa
        // value un, ps, email
        jsonArray tempMemory = account.getALL();
        int index = -1;
        index = Account.search("un", name);
        // 1. already login
        if (name.equals(this.name)) {
            System.out.println("[already login ] you already login");
            // 2. dang nhập nhiều tai khoan => name nhap vào != account.name

        } else if (this.name != null && this.name.equals(name)) {
            System.out.println("[invalid multicle login] you need to logout first to try another login");
        } else if (index != -1) {
            JsonObject jsonObject = tempMemory.get(index).getAsJsonObject();
            String passwordAcc = jsonObject.get("PS").getAsString();
            if (passwordAcc = password) {
                String email = tempMemory.get("email").getAsString();
                String emaiL = jsonObject.get("email").getAsString();
                System.out.println("[Logged in] you was logged in");

            } else {
                System.out.println("[waring pasword] the pasword you entered is in ter ract tich");
            }
        } else {
            System.out.println("[don't account] you don't account");
        }
        // 3. chua đăng ký
        // 4. dang nhap bình thường

    }

    private void setAccount(String name, String password, String email) {
        this.name = name;
        this.Password = password;
        this.Email = email;
        this.Loggedin = true;

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
