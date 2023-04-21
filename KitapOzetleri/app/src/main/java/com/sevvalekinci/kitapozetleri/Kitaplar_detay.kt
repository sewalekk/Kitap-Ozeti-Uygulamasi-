package com.sevvalekinci.kitapozetleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kitaplar_detay.*

class Kitaplar_detay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitaplar_detay)

        var bundle:Bundle = intent.extras!!
        var adi=bundle.getString("constAdi")
        var aciklama=bundle.getString("constAciklama")
        var resim=bundle.getInt("constResim")

        detay_adi.text=adi
        detay_aciklama.text=aciklama
        detay_resim.setImageResource(resim)
    }
}