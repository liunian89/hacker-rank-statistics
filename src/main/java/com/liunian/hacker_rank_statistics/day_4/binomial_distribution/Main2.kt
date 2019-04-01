package com.liunian.hacker_rank_statistics.day_4.binomial_distribution

import java.math.RoundingMode
import kotlin.math.pow

private val PROB = 0.12
private val N = 10

fun main(args: Array<String>) {
    val prob1 = IntRange(0, 2)
            .map { probabilityOfBinomialDistribution(N, it, PROB) }
            .sum()
            .toBigDecimal()
            .setScale(3, RoundingMode.HALF_UP)
            .toDouble()

    val prob2 = IntRange(2, 10)
            .map { probabilityOfBinomialDistribution(N, it, PROB) }
            .sum()
            .toBigDecimal()
            .setScale(3, RoundingMode.HALF_UP)
            .toDouble()

    println(prob1)
    println(prob2)
}


fun probabilityOfBinomialDistribution(n: Int, r: Int, prob: Double): Double {
    return n.factorial() / (n - r).factorial() / r.factorial() * prob.pow(r) * (1 - prob).pow(n - r)
}

fun Int.factorial(): Int {

    return if (this == 0 || this == 1) 1
    else this * (this - 1).factorial()
}



