package com.example.sahil_project

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.punjabiagyeoyee.R

class Second_page : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
      var name :TextView? = null
       var contact :TextView? = null
       var email :TextView? = null
       var address:TextView? = null
       var password:TextView? = null
       var confirm :TextView? = null

        name=findViewById(R.id.etName)
       contact=findViewById(R.id.etContact)
        email=findViewById(R.id.etEmail)
       address=findViewById(R.id.etAddress)
        password=findViewById(R.id.etPassword)
       confirm=findViewById(R.id.etConfirmPassword)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_myproject)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       val intent = intent
        val first = intent.getStringExtra("Name")
        val second = intent.getStringExtra("Contact")
        val third = intent.getStringExtra("Email")
        val fourth = intent.getStringExtra("Address")
        val fifth = intent.getStringExtra("Password")
       val six = intent.getStringExtra("Confirm")

        name.text=first
        contact.text=second
        email.text=third
        address.text=fourth
        password.text=fifth
        confirm.text=six
    }
}