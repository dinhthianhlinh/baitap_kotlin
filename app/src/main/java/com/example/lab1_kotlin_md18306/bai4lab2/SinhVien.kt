package com.example.lab1_kotlin_md18306.bai4lab2

import java.util.Scanner

fun main() {
    val quanLySV = QuanLySinhVien()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("===== Chương trình quản lý Sinh viên =====")
        println("1. Thêm Sinh viên")
        println("2. Sửa thông tin Sinh viên")
        println("3. Xóa Sinh viên")
        println("4. Xem danh sách Sinh viên")
        println("5. Thoát")
        print("Nhập lựa chọn của bạn: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Nhập tên Sinh viên: ")
                val ten = readLine()!!
                print("Nhập MSSV: ")
                val mssv = readLine()!!
                print("Nhập điểm TB: ")
                val diemTB = scanner.nextFloat()
                print("Sinh viên đã tốt nghiệp? (true/false): ")
                val daTotNghiep = scanner.nextBoolean()
                print("Nhập tuổi (nếu có): ")
                val tuoi = if (scanner.hasNextInt()) scanner.nextInt() else null
                quanLySV.themSinhVien(SinhVien(ten, mssv, diemTB, daTotNghiep, tuoi))
            }
            2 -> {
                print("Nhập MSSV của Sinh viên cần sửa: ")
                val mssv = readLine()!!
                print("Nhập tên mới: ")
                val tenMoi = readLine()!!
                print("Nhập điểm TB mới: ")
                val diemTBMoi = scanner.nextFloat()
                print("Sinh viên đã tốt nghiệp? (true/false): ")
                val daTotNghiepMoi = scanner.nextBoolean()
                print("Nhập tuổi mới (nếu có): ")
                val tuoiMoi = if (scanner.hasNextInt()) scanner.nextInt() else null
                quanLySV.suaSinhVien(mssv, tenMoi, diemTBMoi, daTotNghiepMoi, tuoiMoi)
            }
            3 -> {
                print("Nhập MSSV của Sinh viên cần xóa: ")
                val mssv = readLine()!!
                quanLySV.xoaSinhVien(mssv)
            }
            4 -> {
                println("===== Danh sách Sinh viên =====")
                quanLySV.xemDanhSachSinhVien()
            }
            5 -> {
                println("Kết thúc chương trình.")
                return
            }
            else -> println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
        }
    }
}

class SinhVien (
    var ten: String,
    var mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)
