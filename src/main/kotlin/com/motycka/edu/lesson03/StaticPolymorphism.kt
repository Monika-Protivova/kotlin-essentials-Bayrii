package com.motycka.edu.lesson03

import kotlin.math.PI

object AreaCalculator {

    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    fun calculateRectangleArea(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    fun calculateCircleArea(r: Double): Double {
        return PI * r * r
    }

    fun calculateCircleArea(r: Int): Double {
        return PI * r.toDouble() * r.toDouble()
    }

    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    fun calculateTriangleArea(a: Int, b: Int): Double {
        return 0.5 * a.toDouble() * b.toDouble()
    }
}


fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
}
