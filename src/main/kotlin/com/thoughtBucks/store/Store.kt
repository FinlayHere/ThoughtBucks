package com.thoughtBucks.store

import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.order.CoffeeOrder

class Store{
    fun makeCoffee(order: CoffeeOrder): Coffee {
        if("Latte".equals(order.type)) {
            return Coffee("Latte")
        }
        return Coffee()
    }

}