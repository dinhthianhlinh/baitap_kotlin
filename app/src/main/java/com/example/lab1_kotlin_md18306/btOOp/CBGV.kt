//package com.example.lab1_kotlin_md18306.btOOp
//
//class CBGV ( hoten: String, tuoi: Int?, quequan: String? , var msgv : String , var luongcung : Float,
//             var LThuong : Float? , var lPhat : Float?) : NguoiModel (hoten, tuoi, quequan) {
//
//                 var lThucLinh : Float = 0f
//                     get() = luongcung +(LThuong?:0f)-(lPhat?:0f)
//    override fun getThongTin(): String {
//        return "CGBV: ${super.getThongTin()} - MSGV: $msgv - Luong Thuc Linh: $lThucLinh"}
//}
package com.example.lab1_kotlin_md18306.btOOp

class CBGV(
    var name: String,
    var age: Int,
    var address: String,
    var phone: String,
    var salary: Float,
    var bonus: Float,
    var penalty: Float
) {
    fun getThongTin(): String {
        return "Name: $name, Age: $age, Address: $address, Phone: $phone, Salary: $salary, Bonus: $bonus, Penalty: $penalty"
    }
}
