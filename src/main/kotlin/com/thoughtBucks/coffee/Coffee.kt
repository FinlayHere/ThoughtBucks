package com.thoughtBucks.coffee

abstract class Coffee(open val type: String) {
    fun whoIamI() = "Coffee"
}

class Latte(override val type: String = "Latte") : Coffee(type) {

}

class LongBlack(override val type: String = "Long Black") : Coffee(type) {

}

class Cappuccino(override val type: String = "Cappuccino") : Coffee(type) {

}