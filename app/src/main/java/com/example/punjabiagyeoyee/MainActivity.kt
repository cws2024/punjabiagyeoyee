package com.example.sahil_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.punjabiagyeoyee.R
import com.example.punjabiagyeoyee.Second_page

class MainActivity : AppCompatActivity() {
    var btn : Button? = null
    var btn2 : Button? = null
    var editText1 : EditText? = null
    var editText2 : EditText? = null
    var editText3 : EditText? = null
    var editText4 : EditText? = null
    var editText5 : EditText? = null
    var editText6 : EditText? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn = findViewById(R.id.btnSave)
        btn2 = findViewById(R.id.btnCancle)
        editText1 = findViewById(R.id.etName)
        editText2 = findViewById(R.id.etContact)
        editText3 = findViewById(R.id.etEmail)
        editText4 = findViewById(R.id.etAddress)
        editText5 = findViewById(R.id.etPassword)
        editText6 = findViewById(R.id.etConfirmPassword)



        btn?.setOnClickListener{


            if(editText1?.text.toString().isNullOrEmpty() || editText2?.text.toString().isNullOrEmpty() || editText3?.text.toString().isNullOrEmpty() || editText4?.text.toString().isNullOrEmpty() || editText5?.text.toString().isNullOrEmpty() || editText6?.text.toString().isNullOrEmpty() ){
                Toast.makeText(this,"Please Enter full details ",Toast.LENGTH_SHORT).show()
                if(editText1?.text.toString().isNullOrEmpty()){
                    editText1?.error="Enter Name"
                }
                if(editText2?.text.toString().isNullOrEmpty()){
                    editText2?.error="Enter Contact"
                }
                if(editText3?.text.toString().isNullOrEmpty()){
                    editText3?.error="Enter Email"
                }
                if(editText4?.text.toString().isNullOrEmpty()){
                    editText4?.error="Enter Address"
                }
                if(editText5?.text.toString().isNullOrEmpty()){
                    editText5?.error="Enter Password"
                }
                if(editText6?.text.toString().isNullOrEmpty()){
                    editText6?.error="Enter Confirm Password"
                }


            }

            else if(editText6?.text.toString() != editText5?.text.toString()){
                editText6?.error=" Password does't match "
            }

            else {
                val intent = Intent(this,Second_page::class.java)

                startActivity(intent)
            }

        }
        btn2?.setOnClickListener{
            Toast.makeText(this,editText1?.text.toString(),Toast.LENGTH_SHORT).show()
        }
    }



}