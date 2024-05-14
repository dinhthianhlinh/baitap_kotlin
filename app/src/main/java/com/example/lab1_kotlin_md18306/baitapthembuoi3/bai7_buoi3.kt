package com.example.lab1_kotlin_md18306.baitapthembuoi3
// Yêu cầu 1: Xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên.
data class Nguoi(
    val hoTen: String,
    val tuoi: Int,
    val queQuan: String,
    val maSoGV: String
)

// Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.
class CBGV(
    val luongCung: Float,
    val luongThuong: Float,
    val tienPhat: Float,
    val nguoi: Nguoi
) {
    var luongThucLinh: Float = 0f

    init {
        tinhLuongThucLinh()
    }

    // Yêu cầu 4: Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
    private fun tinhLuongThucLinh() {
        luongThucLinh = luongCung + luongThuong - tienPhat
    }
}

// Yêu cầu 3: Xây dựng các phương thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.
class QuanLyCBGV {
    val danhSachCBGV = mutableListOf<CBGV>()

    // Phương thức thêm cán bộ giáo viên
    fun themCBGV(gv: CBGV) {
        danhSachCBGV.add(gv)
    }

    // Phương thức xóa cán bộ giáo viên theo mã số giáo viên
    fun xoaCBGV(maSoGV: String) {
        danhSachCBGV.removeAll { it.nguoi.maSoGV == maSoGV }
    }
}

fun main() {
    // Test chương trình
    val quanLy = QuanLyCBGV()

    // Tạo và thêm cán bộ giáo viên
    val giaoVien1 = CBGV(500f, 100f, 50f, Nguoi("Nguyen Van A", 35, "Ha Noi", "GV001"))
    val giaoVien2 = CBGV(600f, 120f, 40f, Nguoi("Tran Thi B", 40, "Ho Chi Minh", "GV002"))
    quanLy.themCBGV(giaoVien1)
    quanLy.themCBGV(giaoVien2)

    // In ra danh sách cán bộ giáo viên
    println("Danh sách cán bộ giáo viên sau khi thêm:")
    quanLy.danhSachCBGV.forEach {
        println("Tên: ${it.nguoi.hoTen}, Mã số: ${it.nguoi.maSoGV}, Lương thực lĩnh: ${it.luongThucLinh}")
    }

    // Xóa cán bộ giáo viên theo mã số
    quanLy.xoaCBGV("GV001")

    // In ra danh sách cán bộ giáo viên sau khi xóa
    println("Danh sách cán bộ giáo viên sau khi xóa:")
    quanLy.danhSachCBGV.forEach {
        println("Tên: ${it.nguoi.hoTen}, Mã số: ${it.nguoi.maSoGV}, Lương thực lĩnh: ${it.luongThucLinh}")
    }
}

class bai7_buoi3 {
}