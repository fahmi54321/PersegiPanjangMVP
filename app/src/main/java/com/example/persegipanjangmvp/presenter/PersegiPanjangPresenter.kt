package com.example.persegipanjangmvp.presenter

import com.example.persegipanjangmvp.model.PersegiPanjang

// TODO 8 Membuat construct dibagian presenter agar interface dapat digunakan
class PersegiPanjangPresenter(var ppView: PersegiPanjangView) {

    //TODO 2 function untuk menghitung luas
    fun hitung(panjang:String,lebar:String)
    {
        // TODO 14 validasi jika ada input yang kosong
        if (panjang.isNotEmpty() && lebar.isNotEmpty())
        {
            //TODO 3 convert String to int
            var Cpanjang = panjang.toInt()
            var CLebar = lebar.toInt()

            //TODO 4 luas persegi panjang
            var total = Cpanjang.times(CLebar)

            //TODO 6 meletakkan hasil logic presenter ke model
            var hasil = PersegiPanjang()
            hasil.total = total

            //TODO 9 Memasukkan Model ke Interface
            ppView.hasil(hasil)
        }

        // TODO 15 jika ada yang kosong maka akan memanggil fungsi isEmpty
        else
        {
            ppView.isEmpty()
        }
    }
}