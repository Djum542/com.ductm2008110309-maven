public class Account {
    private String name;
    private String Password;
    private String Email;
    private boalean Loggedin;

    public Account() {
        this.name();
        this.Password();
        this.Email();
        this.Loggedin();

    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setLoggedin(boalean loggedin) {
        Loggedin = loggedin;
    }

    public boalean getLoggedin() {
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

}
