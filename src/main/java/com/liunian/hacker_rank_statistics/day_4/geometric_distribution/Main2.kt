package com.liunian.hacker_rank_statistics.day_4.geometric_distribution

import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
    val prob = IntRange(1, 5).map { probabilityOfGeometricDistribution(it, 1 / 3.0) }
            .sum()
            .toBigDecimal()
            .setScale(3, RoundingMode.HALF_UP)
            .toDouble()

    println(prob)
}


fun probabilityOfGeometricDistribution(x: Int, prob: Double): Double {
    return prob * (1 - prob).pow(x - 1)
}