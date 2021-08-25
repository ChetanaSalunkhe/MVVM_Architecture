package com.example.mvvm_designpattern;

import androidx.annotation.Nullable;

public class Model {

    @Nullable
    String email, password;

    public Model(String _email, String _password){
        email = _email;
        password = _password;

    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }
}
