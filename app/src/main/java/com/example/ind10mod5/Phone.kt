package com.example.ind10mod5

open class Phone (var isScreenLihgtOn: Boolean = false) {
    // Encender el telefono
    open fun switchOn() {
        isScreenLihgtOn = true
    }
    fun switchOff() {
        isScreenLihgtOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLihgtOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
