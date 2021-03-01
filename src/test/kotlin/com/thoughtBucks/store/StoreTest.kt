package com.thoughtBucks.store


import com.thoughtBucks.order.CoffeeOrder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class StoreTest {
    private lateinit var store: Store

    @BeforeEach
    fun initEnv() {
        store = Store()
    }

    @Test
    fun `should store provide coffee when store receive order`() {
        val order = CoffeeOrder(type = "Latte", size = "s")
        assertThat(store.orderCoffee(order).type).isEqualTo("Latte")
    }

    @Test
    fun `should store provide latte coffee when make coffee with order type coffee`() {
        val order = CoffeeOrder(type = "Latte", size = "s")
        assertThat(store.orderCoffee(order).type).isEqualTo("Latte")
    }

    @Test
    fun `should store provide latte coffee when make coffee with order type Cappuccino`() {
        val order = CoffeeOrder(type = "Cappuccino", size = "s")
        assertThat(store.orderCoffee(order).type).isEqualTo("Cappuccino")
    }

    @Test
    fun `should throw exception when make coffee given unknown coffee type`() {
        val order = CoffeeOrder(type = "Cat Shit", size = "s")
        assertThrows<IllegalArgumentException>("Unknown coffee type") {
            store.orderCoffee(order)
        }
    }

    @Test
    fun `should have size of coffee when make coffee`() {
        val order = CoffeeOrder(type = "Latte", size = "s")
        assertThat(store.orderCoffee(order).size).isEqualTo("s")
    }

    @Test
    fun `should have sugar when make coffee`() {
        val longBlackOrder = CoffeeOrder(type = "Long Black", size = "s")
        val latteOrder = CoffeeOrder(type = "Latte", size = "s")
        assertThat(store.orderCoffee(longBlackOrder).sugar).isEqualTo(0)
        assertThat(store.orderCoffee(latteOrder).sugar).isEqualTo(20)
    }

    @Test
    fun `should make coffee with certain sugar given order has sugar`() {
        val longBlackWithSugarOrder = CoffeeOrder(type = "Long Black", size = "m", sugar = 10)
        assertThat(store.orderCoffee(longBlackWithSugarOrder).sugar).isEqualTo(10)
    }
}