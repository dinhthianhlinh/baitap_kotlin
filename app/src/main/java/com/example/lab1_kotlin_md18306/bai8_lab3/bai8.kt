package com.example.lab1_kotlin_md18306.bai8_lab3

fun main() {
    val danhSachTheMuon = mutableListOf<TheMuon>()
    var tiepTuc: Boolean

    println("------------------------")
    println("Menu quan ly the muon")
    println("1. Them the muon")
    println("2. Hien thi danh sach the muon")
    println("3. Xoa the muon")
    println("4. Thoat chuong trinh")

    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Them the muon")
                    println("--------------------------")
                    print("Nhap ma phieu muon: ")
                    val maPhieuMuon = readLine()!!
                    print("Nhap ngay muon: ")
                    val ngayMuon = readLine()!!.toInt()
                    print("Nhap han tra: ")
                    val hanTra = readLine()!!.toInt()
                    print("Nhap so hieu sach: ")
                    val soHieuSach = readLine()!!

                    print("Nhap ho ten sinh vien: ")
                    val hoTen = readLine()!!
                    print("Nhap tuoi sinh vien: ")
                    val tuoi = readLine()!!.toIntOrNull()
                    print("Nhap lop sinh vien: ")
                    val lop = readLine()!!

                    val sinhVien = SinhVien(hoTen, tuoi, lop)
                    val theMuon = TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien)
                    danhSachTheMuon.add(theMuon)
                }

                2 -> {
                    println("Danh sach the muon")
                    println("--------------------------")
                    for (theMuon in danhSachTheMuon) {
                        println(theMuon.getThongTin())
                    }
                }

                3 -> {
                    println("Xoa the muon")
                    println("--------------------------")
                    print("Nhap ma phieu muon can xoa: ")
                    val maPhieuMuon = readLine()!!
                    val iterator = danhSachTheMuon.iterator()
                    var found = false
                    while (iterator.hasNext()) {
                        val theMuon = iterator.next()
                        if (theMuon.maPhieuMuon == maPhieuMuon) {
                            iterator.remove()
                            found = true
                            println("Da xoa the muon voi ma phieu $maPhieuMuon")
                            break
                        }
                    }
                    if (!found) {
                        println("Khong tim thay the muon voi ma phieu $maPhieuMuon")
                    }
                }

                4 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                    break
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)

}