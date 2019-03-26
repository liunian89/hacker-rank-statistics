package com.liunian.hacker_rank_statistics.day_1.quartiles

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val array = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val sortedArray = array.sortedArray()
    val q1 = sortedArray.splitFromMedian().first.toTypedArray().median()
    val q2 = sortedArray.median()
    val q3 = sortedArray.splitFromMedian().second.toTypedArray().median()
    println(q1)
    println(q2)
    println(q3)
}

private fun Array<Int>.median(): Int {
    return if (size % 2 == 0) (this[size / 2] + this[size / 2 - 1]) / 2
    else this[(size - 1) / 2]
}

private fun Array<Int>.splitFromMedian(): Pair<List<Int>, List<Int>> {
    return if (size % 2 == 0) Pair(this.slice(IntRange(0, size / 2 - 1)), this.slice(IntRange(size / 2, size - 1)))
    else Pair(this.slice(IntRange(0, (size - 1) / 2 - 1)), this.slice(IntRange((size - 1) / 2 + 1, size - 1)))
}
