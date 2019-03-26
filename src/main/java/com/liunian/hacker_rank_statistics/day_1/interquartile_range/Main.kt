package com.liunian.hacker_rank_statistics.day_1.interquartile_range

import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val base = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val freq = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val splits = base.zip(freq) { a, b -> Array(b) { a } }
            .flatMap { it.toList() }
            .sorted()
            .splitFromMedian()
    println((splits.second.median() - splits.first.median()).scale(1))
}

private fun List<Int>.splitFromMedian(): Pair<List<Int>, List<Int>> {
    return if (size % 2 == 0) Pair(this.slice(IntRange(0, size / 2 - 1)), this.slice(IntRange(size / 2, size - 1)))
    else Pair(this.slice(IntRange(0, (size - 1) / 2 - 1)), this.slice(IntRange((size - 1) / 2 + 1, size - 1)))
}

private fun List<Int>.median(): Double {
    return if (size % 2 == 0) (this[size / 2] + this[size / 2 - 1]) / 2.0
    else this[(size - 1) / 2].toDouble()
}

private fun Double.scale(scale: Int): Double {
    return this.toBigDecimal()
            .setScale(scale, RoundingMode.HALF_UP)
            .toDouble()
}

