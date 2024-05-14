package com.example.lab1_kotlin_md18306.bai4lab2

import java.util.Scanner

class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVien>()

    fun themSinhVien(sv: SinhVien) {
        danhSachSinhVien.add(sv)
    }

    fun suaSinhVien(mssv: String, tenMoi: String, diemTBMoi: Float, daTotNghiepMoi: Boolean?, tuoiMoi: Int?) {
        val sv = danhSachSinhVien.find { it.mssv == mssv }
        sv?.apply {
            ten = tenMoi
            diemTB = diemTBMoi
            daTotNghiep = daTotNghiepMoi
            tuoi = tuoiMoi
        }
    }

    fun xoaSinhVien(mssv: String) {
        danhSachSinhVien.removeAll { it.mssv == mssv }
    }

    fun xemDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Danh sách sinh viên trống.")
            return
        }
        danhSachSinhVien.forEachIndexed { index, sv ->
            println("Sinh viên ${index + 1}:")
            println("Tên: ${sv.ten}")
            println("MSSV: ${sv.mssv}")
            println("Điểm TB: ${sv.diemTB}")
            println("Đã tốt nghiệp: ${sv.daTotNghiep ?: false}")
            println("Tuổi: ${sv.tuoi ?: "Chưa có"}")
            println()
        }
    }
}