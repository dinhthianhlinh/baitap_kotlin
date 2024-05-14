package com.example.lab1_kotlin_md18306.baithemlab1

import com.example.lab1_kotlin_md18306.phepChia

data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

// bai 5
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}
//bai6
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                                                             // 2
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}
// bài 7
const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}
// bai 8
//val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

//val positives = numbers.filter { x -> x > 0 }  // 2
//
//val negatives = numbers.filter { it < 0 }

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
            k, v -> println("ID $k: credit $v")
    }
}
// bài 9
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

val anyNegative = numbers.any { it < 0 }             // 2

val anyGT6 = numbers.any { it > 6 }

// bai 10
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

val first = words.find { it.startsWith("some") }                                // 2
val last = words.findLast { it.startsWith("some") }                             // 3

val nothing = words.find { it.contains("nothing") }
fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
// bai 5
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }// 5
//bai 6
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")


// bài 7

    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8
    accountsReport()


    // bài 8
    println(numbers)
//    println(positives)
//    println(negatives)
    // bài 9
    println(numbers)
    println(anyNegative)
    println(anyGT6)


    // bai 10
    println(words)
    println(first)
    println(last)
    println(nothing)
}
class bai5 {
}