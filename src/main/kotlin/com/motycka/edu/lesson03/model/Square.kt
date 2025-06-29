package com.motycka.edu.lesson03.model

class Square(private val sideLength: Double) : Rectangle(sideLength, sideLength) {

    // Override area to ensure it's correct (optional because Rectangle's implementation works)
    override fun area(): Double {
        return sideLength * sideLength
    }

    // Override perimeter (optional, Rectangle's implementation also works)
    override fun perimeter(): Double {
        return 4 * sideLength
    }

    // Override to3D to return a Cuboid with all sides equal
    override fun to3D(depth: Double): Shape3D {
        // Since it's a cube, depth should be same as sideLength.
        // Ignoring the passed depth parameter or you can choose to enforce it.
        return Cuboid(sideLength, sideLength, sideLength)
    }
}