package com.example.mvvm_designpattern;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.regex.Pattern;

public class AppViewModel extends BaseObservable {

    private Model model;
    private String successMessage = "Login successful.";
    private String errorMessage = "Email or password is not valid.";

    @Bindable
    private String toastMessage = null;

    public AppViewModel(){
        model = new Model("","");
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
    }

    public String getEmail(){
        return model.getEmail();
    }

    public void setEmail(String email){
        model.setEmail(email);
    }

    public String getPassword(){
        return model.getPassword();
    }

    public void setPassword(String password){
        model.setPassword(password);
    }

    public void onButtonCLicked(){
        if(isValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isValid(){
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length()>4;
    }

}
