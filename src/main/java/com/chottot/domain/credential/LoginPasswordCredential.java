package com.chottot.domain.credential;

import com.chottot.domain.email.EmailAddress;

final public class LoginPasswordCredential {
    private final String login;
    private final String password;

    private LoginPasswordCredential(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public static LoginPasswordCredential createLoginPasswordCredential(String login, String password){

        if(login == null || login.isEmpty()){
            throw new IllegalArgumentException("Your login can't be empty");
        }

        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Your password can't be empty");
        }

        return new LoginPasswordCredential(login, password);
    }

    public static LoginPasswordCredential createLoginPasswordCredentialWithEmailAddress(EmailAddress emailAddress, String password){
        return createLoginPasswordCredential(emailAddress.getEmail(), password);
    }

}
