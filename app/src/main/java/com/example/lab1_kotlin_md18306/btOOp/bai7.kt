package com.example.lab1_kotlin_md18306.btOOp

fun main() {
    var teachers = mutableListOf<CBGV>()

    // Sample teacher
    var gv1 = CBGV("Nuyen Van Long", 30, "HCM", "45748547", 500f, 50f, 10f)
    teachers.add(gv1)

    println(gv1.getThongTin())
    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Nhap thong tin giao vien moi:")
                    print("Name: ")
                    val name = readLine()!!
                    print("Age: ")
                    val age = readLine()!!.toInt()
                    print("Address: ")
                    val address = readLine()!!
                    print("Phone: ")
                    val phone = readLine()!!
                    print("Salary: ")
                    val salary = readLine()!!.toFloat()
                    print("Bonus: ")
                    val bonus = readLine()!!.toFloat()
                    print("Penalty: ")
                    val penalty = readLine()!!.toFloat()
                    val newTeacher = CBGV(name, age, address, phone, salary, bonus, penalty)
                    teachers.add(newTeacher)
                    println("Giao vien moi da duoc them vao danh sach.")
                }

                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    teachers.forEach { println(it.getThongTin()) }
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    print("Nhap so dien thoai cua giao vien can xoa: ")
                    val phone = readLine()!!
                    teachers.removeIf { it.phone == phone }
                    println("Giao vien da duoc xoa.")
                }

                4 -> {
                    println("Cap nhat thong tin giao vien")
                    print("Nhap so dien thoai cua giao vien can cap nhat: ")
                    val phone = readLine()!!
                    val teacher = teachers.find { it.phone == phone }
                    if (teacher != null) {
                        print("Name (${teacher.name}): ")
                        teacher.name = readLine()!!
                        print("Age (${teacher.age}): ")
                        teacher.age = readLine()!!.toInt()
                        print("Address (${teacher.address}): ")
                        teacher.address = readLine()!!
                        print("Salary (${teacher.salary}): ")
                        teacher.salary = readLine()!!.toFloat()
                        print("Bonus (${teacher.bonus}): ")
                        teacher.bonus = readLine()!!.toFloat()
                        print("Penalty (${teacher.penalty}): ")
                        teacher.penalty = readLine()!!.toFloat()
                        println("Thong tin giao vien da duoc cap nhat.")
                    } else {
                        println("Khong tim thay giao vien voi so dien thoai da nhap.")
                    }
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                    break
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            print("Ban co muon chon tiep lua chon tren menu? (c/k): ")
            val s = readLine()
            tiepTuc = s?.lowercase() == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}
