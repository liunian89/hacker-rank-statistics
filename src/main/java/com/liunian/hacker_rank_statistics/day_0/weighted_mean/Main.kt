package com.liunian.hacker_rank_statistics.day_0.weighted_mean

import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().toInt()
    val base = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val weight = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val weightedMean = base.zip(weight) { a, b -> a * b }
            .sum()
            .div(weight.sum().toDouble())
            .toBigDecimal()
            .setScale(1, RoundingMode.HALF_UP)

    println(weightedMean)
}

/**
 * 30
 * 10 40 30 50 20 10 40 30 50 20 1 2 3 4 5 6 7 8 9 10 20 10 40 30 50 20 10 40 30 50
 * 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 10 40 30 50 20 10 40 30 50 20
 */
