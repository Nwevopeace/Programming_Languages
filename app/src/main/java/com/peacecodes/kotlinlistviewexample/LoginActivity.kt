package com.peacecodes.kotlinlistviewexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener{
            var userEmail = "peace@gmail.com"
            var userPassword = "zuriTask6"
            val Email_Address = email.text.toString()
            val Password = password.text.toString()
            if (Email_Address == userEmail && Password == userPassword) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this,"Use peace@gmail.com as your email and zuriTask6 as password to login", Toast.LENGTH_LONG).show()
            }
        }
    }
}