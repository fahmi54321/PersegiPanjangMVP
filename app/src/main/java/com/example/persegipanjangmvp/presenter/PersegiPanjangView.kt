package com.example.persegipanjangmvp.presenter

import com.example.persegipanjangmvp.model.PersegiPanjang

//TODO 7 membuat interface untuk melemparkan hasil logic presenter ke view
interface PersegiPanjangView {

    fun hasil(hasil : PersegiPanjang)
    fun isEmpty()
}