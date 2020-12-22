package com.tugastengahsemester.burhanuddin.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.burhanuddin.R

class InfoAplikasi : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_aplikasi)
        img = findViewById(R.id.ic_inf_bck_home)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.ic_inf_bck_home ->{
                val goHome = Intent(this@InfoAplikasi, Home::class.java)
                startActivity(goHome)
            }
        }
    }
}