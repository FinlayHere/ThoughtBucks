package com.thoughtBucks.store


import com.thoughtBucks.order.CoffeeOrder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class StoreTest {
    private var store = Store()

    @Test
    fun `should store provide coffee when store receive order`() {
        val order = CoffeeOrder()
        assertThat(store.makeCoffee(order).whoIamI()).isEqualTo("Coffee")
    }

    @Test
    fun `should store provide latte coffee when make coffee with order type coffee`() {
        val order = CoffeeOrder(type = "Latte")
        assertThat(store.makeCoffee(order).type).isEqualTo("Latte")
    }

    @Test
    fun `should store provide latte coffee when make coffee with order type Cappuccino`() {
        val order = CoffeeOrder(type = "Cappuccino")
        assertThat(store.makeCoffee(order).type).isEqualTo("Cappuccino")
    }

    @Test
    fun `should throw exception when make coffee given unknown coffee type`() {
        val order = CoffeeOrder(type = "Cat Shit")
        assertThrows<IllegalArgumentException>("Unknown coffee type") {
            store.makeCoffee(order)
        }
    }
    @Test
    fun `should have size of coffee when make coffee`() {
        var order = CoffeeOrder(type = "Latte", size = "s")
        assertThat(store.makeCoffee(order).size).isEqualTo("S")
    }

}