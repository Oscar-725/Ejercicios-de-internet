package com.cursofinal.example.ejerciciounoi

fun main() {

    val child = 5
    val adult = 28
    val senior = 101

    val isMonday = true

    fun ticketPrice(age: Int, isMonday: Boolean): Int {
        var precio = 0

        if (age <= 12){
            precio = 15
        }

        if (age >= 13 && age <= 60 && isMonday){
                precio = 25
            }else if (age >= 13 && age <= 60 && isMonday != true){
                precio = 30
        }

        if (age >= 61 && age <= 100){
            precio = 20
        } else if (age >= 101 || age <= 0 ){
           precio = -1
        }
        return precio

    }

    println("The movie ticket price for a person aged $child is  $${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is $${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is $${ticketPrice(senior, isMonday)}.")
}