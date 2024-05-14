package com.example.lab1_kotlin_md18306.bai8_lab3

class SinhVien(var hoTen: String, var tuoi: Int?, var lop: String) {
    fun getThongTin(): String {
        return "$hoTen - tuoi: $tuoi - lop: $lop"
    }
}