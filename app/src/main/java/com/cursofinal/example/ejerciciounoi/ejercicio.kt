package com.cursofinal.example.ejerciciounoi

fun main(){
   val morningNotification = 51
   val eveningNotification = 100

   fun printNotificationSummary(numberOfMessages: Int) {

      if (numberOfMessages < 100){
         println("You have $numberOfMessages notifications.")
      }else {
         println("Your phone is blowing up! You have 99+ notifications.")
      }

   }

   printNotificationSummary(morningNotification)
   printNotificationSummary(eveningNotification)
}



