package com.liunian.hacker_rank_statistics.day_4.geometric_distribution

import java.math.RoundingMode
import kotlin.math.pow

class Main1 {
    fun main(args: Array<String>) {
        println(probabilityOfGeometricDistribution(5, 1 / 3.0))
    }


    fun probabilityOfGeometricDistribution(x: Int, prob: Double): Double {
        return prob * (1 - prob).pow(x - 1)
                .toBigDecimal()
                .setScale(3, RoundingMode.HALF_UP)
                .toDouble()
    }
}