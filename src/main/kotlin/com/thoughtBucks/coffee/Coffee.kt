package com.thoughtBucks.coffee

abstract class Coffee(open val type: String = "Coffee", val size: String, val sugar: Int? = null)

class Latte(override val type: String = "Latte", size: String, sugar: Int = 20) : Coffee(type, size, sugar)

class LongBlack(override val type: String = "Long Black", size: String, sugar: Int = 0) : Coffee(type, size, sugar)

class Cappuccino(override val type: String = "Cappuccino", size: String, sugar: Int = 30) : Coffee(type, size, sugar)