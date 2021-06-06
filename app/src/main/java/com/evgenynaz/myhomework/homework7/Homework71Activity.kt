package com.evgenynaz.myhomework.homework7

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Array.get

class Homework71Activity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val  textView =  TextView(this)
        textView.textSize = 26F
        textView.setPadding(16, 16, 16, 16)
        val arguments = intent.extras

        if(arguments!=null){
            var login = arguments.get("login").toString();
            val password = arguments.get("password").toString();
            textView.setText("Login:$login , Password: $password")
        }

        setContentView(textView);
    }
}






