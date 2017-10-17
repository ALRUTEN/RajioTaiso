package com.example.apprenti.rajiotaiso;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        TextView textView  = (TextView) findViewById(R.id.result_username);
        TextView textView2 = (TextView) findViewById(R.id.result_school);
        TextView textView3 = (TextView) findViewById(R.id.result_language);

        UserModel userModel = getIntent().getExtras().getParcelable("usermodel");
        String username = userModel.getUserName();
        String school = userModel.getSchool();
        String language = userModel.getLanguage();

        textView.setText(username);
        textView2.setText(school);
        textView3.setText(language);
    }

}
