package com.tugastengahsemester.burhanuddin.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.burhanuddin.R
class DetaiNegeriDiatasAwan : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_negeri_diatas_awan)
        img = findViewById(R.id.kembali_kedaftar3)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.kembali_kedaftar3 ->{
                val kedaftarLagi = Intent(this@DetaiNegeriDiatasAwan, DaftarWisata::class.java)
                startActivity(kedaftarLagi)
            }
        }
    }
}