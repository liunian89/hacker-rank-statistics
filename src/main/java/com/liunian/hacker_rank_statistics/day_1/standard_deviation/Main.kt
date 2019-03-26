package com.liunian.hacker_rank_statistics.day_1.standard_deviation

import java.math.RoundingMode
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val array = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    println(array.standardDeviation())
}

private fun Array<Int>.standardDeviation(): Double {
    val mean = this.sum() / size.toDouble()
    val standardVariance = this.fold(0.0) { acc, i -> acc + (i - mean).pow(2) } / this.size
    return sqrt(standardVariance)
            .toBigDecimal()
            .setScale(1, RoundingMode.HALF_UP)
            .toDouble()
}

