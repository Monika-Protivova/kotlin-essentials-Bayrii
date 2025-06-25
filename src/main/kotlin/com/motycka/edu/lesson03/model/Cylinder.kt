package com.motycka.edu.lesson03.model

import kotlin.math.PI

class Cylinder(private val radius: Double, private val height: Double) : Shape3D {

    override fun volume(): Double {
        return PI * radius * radius * height
    }

    override fun surfaceArea(): Double {
        return 2 * PI * radius * (radius + height)
    }
}