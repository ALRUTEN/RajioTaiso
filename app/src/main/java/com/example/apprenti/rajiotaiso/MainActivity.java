package com.example.apprenti.rajiotaiso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add_user;
    EditText username_input;
    EditText scool_edit;
    EditText language_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_input = (EditText) findViewById(R.id.username_input);
        add_user = (Button) findViewById(R.id.add_user);
        scool_edit = (EditText) findViewById(R.id.scool_edit);
        language_edit = (EditText) findViewById(R.id.language_edit);

        add_user.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, UserActivity.class);

                Toast.makeText(MainActivity.this, (username_input.getText().toString()),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(MainActivity.this, (scool_edit.getText().toString()),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(MainActivity.this, (language_edit.getText().toString()),
                        Toast.LENGTH_LONG).show();

                String username = username_input.getText().toString();
                String scool = scool_edit.getText().toString();
                String language = language_edit.getText().toString();

                UserModel userModel = new UserModel(username,scool,language);

                intent.putExtra("usermodel", userModel);

                startActivity(intent);
            }

        });

    }

}



