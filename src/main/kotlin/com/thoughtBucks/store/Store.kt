package com.thoughtBucks.store

import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.order.CoffeeOrder

class Store {
    private val factory = CoffeeFactory()

    fun orderCoffee(order: CoffeeOrder): Coffee {
        return factory.makeCoffee(order)
    }
}