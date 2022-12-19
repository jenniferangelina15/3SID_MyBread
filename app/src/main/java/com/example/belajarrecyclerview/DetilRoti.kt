package com.example.belajarrecyclerview

import  android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.detil_roti.*

class DetilRoti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detil_roti)
        if (intent.hasExtra("namanya")){
            val nama: String = this.intent.getStringExtra("namanya").toString()
            val foto: String = this.intent.getStringExtra("namanya").toString()
            val desc: String = this.intent.getStringExtra("namanya").toString()
            val harga: String = this.intent.getStringExtra("namanya").toString()
            setDetil(foto, nama, desc, harga)
        }
    }

    fun setDetil(foto: String, nama: String, desc: String, harga: String) {
        val requestOp: RequestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        nama_detil_roti.text = nama
        desc_detil_roti.text = desc
        harga_detil_roti.text = harga

        Glide.with(this)
        .load(foto)
            .apply(requestOp)
            .centerCrop()
            .into(foto_detil)
    }
}