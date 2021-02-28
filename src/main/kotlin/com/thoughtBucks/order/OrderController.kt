package com.thoughtBucks.order

import com.thoughtBucks.order.command.CreateOrderCommand
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/order")
class OrderController {
    val logger = LoggerFactory.getLogger("com.thoughtBucks.order.OrderController")
    @PostMapping
    fun createOrder(@RequestBody createOrder: CreateOrderCommand){
        logger.info("receive create order request {}", createOrder)
    }
}