package com.example.pertemuan9.viewmodel

import com.example.pertemuan9.room.Siswa

data class DetailSiswa(
    val id : Int = 0,
    val nama : String = "",
    val alamat : String = "",
    val telepon : String = "",
)

fun Siswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telepon = telepon,
)