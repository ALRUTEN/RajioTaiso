package com.example.apprenti.rajiotaiso;

/**
 * Created by apprenti on 11/10/17.
 */

public class NameActivity {
    public String username_input;
    public String result_username;


    public NameActivity(String username_input, String result_username) {
        this.username_input = username_input;
        this.result_username= result_username;

    }

    public String getUsername_input() {
        return username_input;
    }

    public void setUsername_input(String username_input) {
        this.username_input = username_input;
    }

    public String getResult_username() {
        return result_username;
    }

    public void setResult_username(String result_username) {
        this.result_username = result_username;
    }
}
