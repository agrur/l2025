package lesson9;

import java.util.Objects;

public class Password {
    //declare attributes
    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object x) {
        if (x == null) return false;
        Password y = (Password) x;
        return y.getPassword() == this.getPassword();
    }

    @Override
    public int hashCode() {
        return  password.hashCode();
    }
}
