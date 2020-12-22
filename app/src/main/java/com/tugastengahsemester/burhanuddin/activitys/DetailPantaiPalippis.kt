package com.tugastengahsemester.burhanuddin.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.tugastengahsemester.burhanuddin.R
class DetailPantaiPalippis : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_pabtai_palippis)

        img = findViewById(R.id.kembali_kedaftar1)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.kembali_kedaftar1 ->{
                val kedaftarLagi = Intent(this@DetailPantaiPalippis, DaftarWisata::class.java)
                startActivity(kedaftarLagi)
            }
        }
    }
}