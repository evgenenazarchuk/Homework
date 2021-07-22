package com.evgenynaz.myhomework.sharedpref

import android.content.SharedPreferences


object SharedPrefsUtils {

    private lateinit var _sharedPrefs: SharedPreferences
    var sharedPrefs: SharedPreferences
        get() = _sharedPrefs
        set(value) {
            _sharedPrefs = value
        }

    fun putString(key: String, value: String){

        sharedPrefs.edit().putString(key, value).apply()
    }
}