package com.liunian.hacker_rank_statistics.day_0.mean_median_mode

import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val scan = Scanner(System.`in`)
    val n = scan.nextLine()

    val array = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    println(array.mean())
    println(array.median())
    println(array.mode())
}

private fun Array<Int>.mean(): Double {
    return this.sum() / size.toDouble()
}

private fun Array<Int>.median(): Double {
    this.sort()
    return if (size % 2 == 0) (this[size / 2] + this[size / 2 - 1]) / 2.0
    else this[(size - 1) / 2].toDouble()
}

private fun Array<Int>.mode(): Int {
    this.sort()
    val eachCount = this.groupingBy { it }
            .eachCount()
    val min = eachCount.values.max()

    return eachCount.entries.first { it.value == min }.key
}

