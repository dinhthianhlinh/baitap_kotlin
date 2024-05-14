package com.example.lab1_kotlin_md18306

fun main (){

    val soA = 5
    val soB = 10


    with(soB){
        soB - this.inc()
        println("So B : $soB")
    }

    val sv1 = SinhVienModel ("long",
        "ph3049", 8f)
    sv1 .apply {
        tenSV = "Tuan"
        diemTB = 9f
    }
    println(sv1)
    val luyThuaBac3CuaA = soA.let{
        val kq = it * it * it
        kq
    }
    val title : String ?  = "Buoi3 - Android Kotlin"
    val length = title.let {
        if (it == null){
            0
        }else{
            it.length
        }
    }
//    val length = title.run {
//        if (isEmpty()){
//            0
//        }else{
//            length
//        }
//    }

    println("do dai cua chuoi $title = $length")
    println(luyThuaBac3CuaA)
    println("Tong 2 so $soA va $soB = ${tinhTong(soA,soB)}")
    println("Tichs  2 so $soA va $soB = ${phepNhan(soA,soB)}")
    println("Thuong   2 so $soA va $soB = ${phepChia(soA.toFloat(),soB.toFloat() )()}")
    println("luythua  2 so $soA va $soB = ${luythua(soA)}")

}
val tinhTong = {soA : Int, soB : Int -> (soA + soB)}
val phepNhan : (Int, Int) -> Int
        = {soA :Int , soB :Int -> (soA*soB)}
val phepChia = {soA : Float , soB : Float -> {
    if (soB == 0f){
        "so bi chia phai khac 0"
    }else{
        val  kq = soA / soB
        kq
    }
}}
val luythua : (Int) -> Int = {it * it}

class buoi3 {
}