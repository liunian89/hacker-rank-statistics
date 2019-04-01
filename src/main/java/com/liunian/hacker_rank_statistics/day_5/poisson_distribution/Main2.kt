package com.liunian.hacker_rank_statistics.day_5.poisson_distribution

import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {

    println(a(0.88))
    println(b(1.55))

}

fun a(x: Double): Double {
    return (160 + (x.pow(2) + x) * 40)
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()
}

fun b(x: Double): Double {
    return (128 + (x.pow(2) + x) * 40)
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()
}

