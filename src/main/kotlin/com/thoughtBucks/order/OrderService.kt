package com.thoughtBucks.order

import com.thoughtBucks.order.command.CreateOrderCommand
import org.springframework.stereotype.Service

@Service
class OrderService {
    fun generateOrder(command: CreateOrderCommand) = CoffeeOrder(command.type, command.size, command.sugar)
}