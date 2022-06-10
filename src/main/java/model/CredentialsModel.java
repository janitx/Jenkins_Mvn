package model;

public class CredentialsModel {
    private String email;
    private String password;
    private String exp;


    public CredentialsModel() {
    }

    public CredentialsModel(String email, String password, String exp) {
        this.email = email;
        this.password = password;
        this.exp = exp;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "CredentialsModel{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", exp='" + exp + '\'' +
                '}';
    }
}
