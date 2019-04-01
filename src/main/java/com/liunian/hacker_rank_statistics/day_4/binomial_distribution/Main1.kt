package com.liunian.hacker_rank_statistics.day_4.binomial_distribution

import java.math.RoundingMode
import kotlin.math.pow

class Main1 {

    private val PROB_BOY = 1.09 / (1.09 + 1)
    private val N = 6

    fun main(args: Array<String>) {
        val prob = IntRange(3, 6)
                .map { probabilityOfBinomialDistribution(N, it, PROB_BOY) }
                .sum()
                .toBigDecimal()
                .setScale(3, RoundingMode.HALF_UP)
                .toDouble()

        println(prob)
    }


    fun probabilityOfBinomialDistribution(n: Int, r: Int, prob: Double): Double {
        return n.factorial() / (n - r).factorial() / r.factorial() * prob.pow(r) * (1 - prob).pow(n - r)
    }

    fun Int.factorial(): Int {

        return if (this == 0 || this == 1) 1
        else this * (this - 1).factorial()
    }

}



