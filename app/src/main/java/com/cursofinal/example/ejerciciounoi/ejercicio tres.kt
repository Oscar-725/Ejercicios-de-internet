package com.cursofinal.example.ejerciciounoi

fun main() {

    printFinalTemperature(27.00, "Celsius", "Fharenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.00, "Kelvin", "Celcius") { it - 273.15 }
    printFinalTemperature(10.00, "Fharenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

    val rows = 3
    val cols = 4

    val arr = Array<CharArray>(3) { CharArray(3) { ' ' } }

    for (row in arr) {
        row[0] = 'x'
        println(row.contentToString())
    }


}

fun printFinalTemperature(initialMeasurement: Double, initialUnit: String, finalUnit: String,
    conversionFormula: (Double) -> Double) {


    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}