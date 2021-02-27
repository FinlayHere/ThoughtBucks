package com.thoughtBucks.store

import com.thoughtBucks.coffee.Cappuccino
import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.coffee.Latte
import com.thoughtBucks.coffee.LongBlack
import com.thoughtBucks.order.CoffeeOrder
import java.lang.IllegalArgumentException

class Store{
    private val factory = CoffeeFactory()

    fun orderCoffee(order: CoffeeOrder): Coffee {
        return factory.makeCoffee(order)
    }
}