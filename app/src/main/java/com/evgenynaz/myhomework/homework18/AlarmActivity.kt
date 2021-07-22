package com.evgenynaz.myhomework.homework18

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.evgenynaz.myhomework.R
import com.evgenynaz.myhomework.databinding.ActivityAlarmBinding
import com.evgenynaz.myhomework.databinding.ActivityHomework10Binding


class AlarmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlarmBinding
    private var ringtone: Ringtone? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlarmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var  notificationUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
         ringtone = RingtoneManager.getRingtone(this, notificationUri)
        if (ringtone == null) {
            notificationUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
            ringtone = RingtoneManager.getRingtone(this, notificationUri)
        }
        if (ringtone != null) {
            ringtone!!.play()
        }
    }

    override fun onDestroy() {
        if (ringtone != null && ringtone!!.isPlaying) {
            ringtone!!.stop()
        }
        super.onDestroy()
    }
}