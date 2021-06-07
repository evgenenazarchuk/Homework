package com.evgenynaz.myhomework.homework7

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.evgenynaz.myhomework.R

class Homework7Activity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var start: Button
    private lateinit var login: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework7)
        text = findViewById(R.id.tv_textView)
        start = findViewById(R.id.button_start)
        password = findViewById(R.id.edit_login)
        login = findViewById(R.id.edit_password)
        val intent = Intent(this, Homework7Activity::class.java)

        val clock = object : CountDownTimer(10000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                text.text = "${millisUntilFinished / 1000}"
            }



            override fun onFinish() {
                //  text.text = "done"
                text.visibility = View.GONE
                login.visibility = View.VISIBLE
                password.visibility = View.VISIBLE
                start.text = "Войти"
                val login: String = login.text.toString()
                val password: String = password.text.toString()
                start.setOnClickListener {
                //    val intent1 = Intent(this, Homework71Activity::class.java)
                    intent.putExtra("Login", login)
                    intent.putExtra("Password", password)
                    startActivity(intent)
                }
            }
        }
        start.setOnClickListener {
            clock.start()
        }
    }
}



