package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var Submitbutton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mAuth = FirebaseAuth.getInstance()

        setContentView(R.layout.activity_main)

        emailInput = findViewById(R.id.SignInEmail)
        passwordInput = findViewById(R.id.SignInPassword)
        Submitbutton = findViewById(R.id.Submitbutton)


        Submitbutton.setOnClickListener {

            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener {task ->
                     if (task.isSuccessful){
                         startActivity(Intent(this, MainActivity::class.java))
                         finish()


                     } else {
                         Toast.makeText(this, "ვაიმეეე!", Toast.LENGTH_LONG).show()

        }

        }






        }
    }


    }
