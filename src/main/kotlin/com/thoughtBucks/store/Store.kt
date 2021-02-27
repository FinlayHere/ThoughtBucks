package com.thoughtBucks.store

import com.thoughtBucks.coffee.Cappuccino
import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.coffee.Latte
import com.thoughtBucks.coffee.LongBlack
import com.thoughtBucks.order.CoffeeOrder
import java.lang.IllegalArgumentException

class Store{
    fun makeCoffee(order: CoffeeOrder): Coffee {
        return when(order.type) {
            "Latte" -> Latte()
            "Cappuccino" -> Cappuccino()
            "Long Black" -> LongBlack()
            else -> throw IllegalArgumentException("Unknown coffee type")
        }
    }

}