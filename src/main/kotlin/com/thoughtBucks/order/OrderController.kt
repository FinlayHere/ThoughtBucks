package com.thoughtBucks.order

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log

@RestController
@RequestMapping("/api/order")
class OrderController {
    @PostMapping
    fun createOrder(@RequestBody any: Any) {
        println(any.toString())
    }
}