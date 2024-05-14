package com.example.lab1_kotlin_md18306.btOOp

open class NguoiModel(var hoten : String, var tuoi : Int?, var quequan : String?) {
    open fun getThongTin() : String{
        return "$hoten - Tuoi : $tuoi -Que : $quequan"
    }
}