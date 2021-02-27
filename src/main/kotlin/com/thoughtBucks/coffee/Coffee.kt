package com.thoughtBucks.coffee

abstract class Coffee(open val type: String, val size: String) {
    fun whoIamI() = "Coffee"
}

class Latte(override val type: String = "Latte", size: String) : Coffee(type, size) {

}

class LongBlack(override val type: String = "Long Black", size: String) : Coffee(type, size) {

}

class Cappuccino(override val type: String = "Cappuccino", size: String) : Coffee(type, size) {

}