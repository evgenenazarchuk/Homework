package com.evgenynaz.myhomework.weather

import android.app.Activity
import android.content.SharedPreferences


class CityPreference(activity: Activity) {
    private var prefs: SharedPreferences = activity.getPreferences(Activity.MODE_PRIVATE)

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    var city: String?
        get() = prefs.getString("city", "Sydney, AU")
        set(city) {
            prefs.edit().putString("city", city).commit()
        }

}