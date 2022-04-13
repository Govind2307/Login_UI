package com.example.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn = findViewById<Button>(R.id.btn);
        var username = findViewById<EditText>(R.id.username);
        var password = findViewById<EditText>(R.id.password);

        btn.setOnClickListener() {
            if (username.getText().toString().equals("Govind") && password.getText().toString()
                    .equals("Purohit")
            )
                Toast.makeText(this, "LogIn Successfully", Toast.LENGTH_SHORT).show();
            else

                Toast.makeText(this, "Password Incorrect", Toast.LENGTH_SHORT).show();
        }


    }
}