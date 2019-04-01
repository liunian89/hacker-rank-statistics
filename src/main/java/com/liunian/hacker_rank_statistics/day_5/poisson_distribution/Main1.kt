package com.liunian.hacker_rank_statistics.day_5.poisson_distribution

import java.math.RoundingMode
import kotlin.math.E
import kotlin.math.pow

class Main1 {

    fun main(args: Array<String>) {
        println(poissonDistribution(2.5, 5))
    }

    fun poissonDistribution(u: Double, k: Int): Double {
        return u.pow(k) * (E.pow(-u)) / factorial(k)
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()
    }

    fun factorial(x: Int): Int {
        return if (x == 0 || x == 1) 1
        else x * factorial(x - 1)
    }

}

