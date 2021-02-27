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

}