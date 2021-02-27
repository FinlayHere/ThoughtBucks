package com.thoughtBucks.store

import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.order.CoffeeOrder
import java.lang.IllegalArgumentException

class Store{
    fun makeCoffee(order: CoffeeOrder): Coffee {
        return when(order.type) {
            "Latte" -> Coffee("Latte")
            "Cappuccino" -> Coffee("Cappuccino")
            "Long Black" -> Coffee("Long Black")
            else -> throw IllegalArgumentException("Unknown coffee type")
        }
    }

}