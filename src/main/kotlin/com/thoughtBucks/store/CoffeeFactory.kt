package com.thoughtBucks.store

import com.thoughtBucks.coffee.Cappuccino
import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.coffee.Latte
import com.thoughtBucks.coffee.LongBlack
import com.thoughtBucks.order.CoffeeOrder

class CoffeeFactory {
    fun makeCoffee(order: CoffeeOrder): Coffee {
        return when (order.type) {
            "Latte" -> Latte(size = order.size, sugar = order.sugar)
            "Cappuccino" -> Cappuccino(size = order.size, sugar = order.sugar)
            "Long Black" -> LongBlack(size = order.size, sugar = order.sugar)
            else -> throw IllegalArgumentException("Unknown coffee type")
        }
    }
}