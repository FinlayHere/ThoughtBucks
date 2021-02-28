package com.thoughtBucks.order.command

data class CreateOrderCommand(val type: String, val size: String, val sugar: Int? = null) {
}
