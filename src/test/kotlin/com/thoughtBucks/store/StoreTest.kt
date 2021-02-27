package com.thoughtBucks.store


import com.thoughtBucks.coffee.Coffee
import com.thoughtBucks.order.CoffeeOrder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreTest {
    @Test
    fun `should store provide coffee when store receive order`() {
        val store = Store()
        val order = CoffeeOrder()
        assertThat(store.makeCoffee(order)).isInstanceOf(Coffee().javaClass)
    }

    @Test
    fun `should store provide latte coffee when make coffee with order type coffee`() {
        val store = Store()
        val order = CoffeeOrder(type = "Latte")
        assertThat(store.makeCoffee(order).type).isEqualTo("Latte")
    }

}