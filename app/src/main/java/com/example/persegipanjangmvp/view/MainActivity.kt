package com.example.persegipanjangmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.persegipanjangmvp.R
import com.example.persegipanjangmvp.model.PersegiPanjang
import com.example.persegipanjangmvp.presenter.PersegiPanjangPresenter
import com.example.persegipanjangmvp.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PersegiPanjangView {

    //TODO 10 membuat variabel untuk memanggil presenter
    private var presenter:PersegiPanjangPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 11 inisialisasi presenter
        presenter = PersegiPanjangPresenter(this)

        //TODO 1 mengambil nilai view
        buttonHitung.setOnClickListener {
            var panjang = panjang.text.toString()
            var lebar = lebar.text.toString()

            //TODO 12 Eksekusi presenter
            presenter?.hitung(panjang, lebar)
        }
    }

    //TODO 13 menampilkan hasil eksekusi presenter
    override fun hasil(hasil: PersegiPanjang)
    {
        Toast.makeText(this,hasil.total.toString(),Toast.LENGTH_LONG).show()
    }
    //TODO 16 hasil eksekusi dari fungsi isEmpty
    override fun isEmpty() {
        Toast.makeText(this,"tidak boleh ada yang kosong",Toast.LENGTH_LONG).show()
    }
}
