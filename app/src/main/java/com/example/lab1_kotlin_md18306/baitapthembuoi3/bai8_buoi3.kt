package com.example.lab1_kotlin_md18306.baitapthembuoi3
// Yêu cầu 1: Xây dựng lớp SinhVien để quản lý thông tin của mỗi sinh viên.
data class SinhVien(
    val hoTen: String,
    val tuoi: Int,
    val lop: String
)

// Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.
class TheMuon(
    val maPhieuMuon: String,
    val ngayMuon: Int,
    val hanTra: Int,
    val soHieuSach: String,
    val sinhVien: SinhVien
)

// Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.
class QuanLyTheMuon {
    private val danhSachTheMuon = mutableListOf<TheMuon>()

    // Phương thức thêm thẻ mượn sách
    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
    }

    // Phương thức xóa thẻ mượn sách theo mã phiếu mượn
    fun xoaTheMuon(maPhieuMuon: String) {
        danhSachTheMuon.removeAll { it.maPhieuMuon == maPhieuMuon }
    }

    // Phương thức hiển thị thông tin các thẻ mượn sách
    fun hienThiDanhSachTheMuon() {
        if (danhSachTheMuon.isEmpty()) {
            println("Danh sách thẻ mượn sách trống.")
            return
        }
        println("===== Danh sách thẻ mượn sách =====")
        danhSachTheMuon.forEachIndexed { index, theMuon ->
            println("Thẻ mượn sách ${index + 1}:")
            println("Mã phiếu mượn: ${theMuon.maPhieuMuon}")
            println("Ngày mượn: ${theMuon.ngayMuon}")
            println("Hạn trả: ${theMuon.hanTra}")
            println("Số hiệu sách: ${theMuon.soHieuSach}")
            println("Thông tin sinh viên:")
            println("  Họ tên: ${theMuon.sinhVien.hoTen}")
            println("  Tuổi: ${theMuon.sinhVien.tuoi}")
            println("  Lớp: ${theMuon.sinhVien.lop}")
            println()
        }
    }
}

fun main() {
    // Test chương trình
    val quanLy = QuanLyTheMuon()

    // Tạo và thêm thẻ mượn sách
    val sinhVien1 = SinhVien("Nguyen Van A", 20, "DH19TH1")
    val theMuon1 = TheMuon("PM001", 1, 7, "SHS001", sinhVien1)
    val sinhVien2 = SinhVien("Tran Thi B", 21, "DH19TH2")
    val theMuon2 = TheMuon("PM002", 2, 8, "SHS002", sinhVien2)
    quanLy.themTheMuon(theMuon1)
    quanLy.themTheMuon(theMuon2)

    // In ra danh sách thẻ mượn sách
    quanLy.hienThiDanhSachTheMuon()

    // Xóa thẻ mượn sách theo mã phiếu mượn
    quanLy.xoaTheMuon("PM001")

    // In ra danh sách thẻ mượn sách sau khi xóa
    quanLy.hienThiDanhSachTheMuon()
}

class bai8_buoi3 {
}