package com.evgenynaz.myhomework.homework7

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.evgenynaz.myhomework.databinding.ActivityHomework7Binding

class Homework7Activity : AppCompatActivity() {
    private var counterTime = 10
    private lateinit var binding: ActivityHomework7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, Homework7Activity::class.java)


        /*val clock = object : CountDownTimer(10000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                text.text = "${millisUntilFinished / 1000}"
            }*/


        binding.buttonStart?.setOnClickListener {
            binding.tvTextView?.text = (counterTime - 1).toString()
            counterTime--
            if (counterTime <= 0) {
                //  text.text = "done"
                binding.tvTextView.visibility = View.GONE
                binding.editLogin.visibility = View.VISIBLE
                binding.editPassword.visibility = View.VISIBLE
                binding.buttonStart.text = "Войти"
                val login: String = binding.editLogin.text.toString()
                val password: String = binding.editPassword.text.toString()
                binding.buttonStart.setOnClickListener {
                    //    val intent1 = Intent(this, Homework71Activity::class.java)
                    intent.putExtra(LOGIN, login)
                    intent.putExtra(PASSWORD, password)
                    startActivity(intent)
                }
            }

        }

        /*start.setOnClickListener {
            clock.start()*/
    }

    override fun onResume() {
        super.onResume()
        binding.tvTextView.text = counterTime.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(COUNTER_KEY, counterTime)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counterTime = savedInstanceState.getInt(COUNTER_KEY)
    }

    companion object {
        const val LOGIN = "LOGIN"
        const val PASSWORD = "PASSWORD"
        private const val COUNTER_KEY = "COUNTER_KEY"
    }
}






