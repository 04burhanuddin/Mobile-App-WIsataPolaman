package com.tugastengahsemester.burhanuddin.activitys

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.tugastengahsemester.burhanuddin.R
class DaftarWisata : AppCompatActivity(), View.OnClickListener{
    private lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_wisata)

        img = findViewById(R.id.ic_dftr_bck_home)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_alun_alun)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_pantai_palippis)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_pantai_gonda)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_negeriatas_awan)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_pantai_dato)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_hutan_bambu)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.ic_dftr_bck_home ->{
                val keHome = Intent(this@DaftarWisata, Home::class.java)
                startActivity(keHome)
            }

            R.id.info_alun_alun ->{
                val keAlunAlun = Intent(this@DaftarWisata, DetailAlunAlun::class.java)
                startActivity(keAlunAlun)
            }

            R.id.info_pantai_gonda ->{
                val kePantaiGonda = Intent(this@DaftarWisata, DetailPantaiGonda::class.java)
                startActivity(kePantaiGonda)
            }

            R.id.info_pantai_palippis ->{
                val kePantaiPalippis = Intent(this@DaftarWisata, DetailPantaiPalippis::class.java)
                startActivity(kePantaiPalippis)
            }

            R.id.info_negeriatas_awan ->{
                val keNegeriAtasAwan = Intent(this@DaftarWisata, DetaiNegeriDiatasAwan::class.java)
                startActivity(keNegeriAtasAwan)
            }

            R.id.info_pantai_dato ->{
                val kePantaiDato = Intent(this@DaftarWisata, DetaiPantaiDato::class.java)
                startActivity(kePantaiDato)
            }

            R.id.info_hutan_bambu ->{
                val keHutanBambu = Intent(this@DaftarWisata, DetailHutanBambu::class.java)
                startActivity(keHutanBambu)
            }
        }
    }
}