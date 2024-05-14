package com.example.lab1_kotlin_md18306.bai8_lab3

class TheMuon(
    var maPhieuMuon: String,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieuSach: String,
    var sinhVien: SinhVien
) {
    fun getThongTin(): String {
        return "TheMuon: MaPhieuMuon: $maPhieuMuon - NgayMuon: $ngayMuon - HanTra: $hanTra - SoHieuSach: $soHieuSach - SinhVien: ${sinhVien.getThongTin()}"
    }
}