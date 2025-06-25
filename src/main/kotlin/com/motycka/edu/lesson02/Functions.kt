package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()
var nextOrderId = 1

// Prices for each coffee type
val prices = mapOf(
    "ESPRESSO" to 3.0,
    "DOUBLE_ESPRESSO" to 4.5,
    "CAPPUCCINO" to 4.0,
    "FLAT_WHITE" to 4.5,
    "AMERICANO" to 3.5
)

fun main() {
    println("Change: ${processOrder(listOf("ESPRESSO", "CAPPUCCINO", "CAPPUCCINO", "AMERICANO"), 20.0)}")
    println("Change: ${processOrder(listOf("ESPRESSO", "FLAT_WHITE", "AMERICANO"), 10.0)}")
    // println("Change: ${processOrder(listOf("ESPRESSO", "ESPRESSO", "DOUBLE_ESPRESSO"), 5.0)}") // will fail due to insufficient payment
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    val change = payment - totalToPay

    if (change < 0) {
        throw IllegalArgumentException("Insufficient payment. Required: $totalToPay, given: $payment")
    }

    completeOrder(orderId)

    return change
}

fun placerOrder(items: List<String>): Int {
    val orderId = nextOrderId++
    coffeeOrders[orderId] = items
    println("Order placed #$orderId: $items")
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: throw IllegalArgumentException("Order ID $orderId not found")
    val total = items.sumOf { prices[it] ?: 0.0 }
    println("Order #$orderId total to pay: $total")
    return total
}

fun completeOrder(orderId: Int) {
    coffeeOrders.remove(orderId)
    println("Order #$orderId completed and removed.")
}
