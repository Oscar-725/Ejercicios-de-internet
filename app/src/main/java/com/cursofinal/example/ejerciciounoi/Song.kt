package com.cursofinal.example.ejerciciounoi

import java.text.SimpleDateFormat
import java.util.*

class Song (var titulo: String, var artista:String,
            var fechaPublicacion: String,
            var playsSong: Int){

    var dateFormat= SimpleDateFormat("dd/MM/yyyy")
    var fecha:Date = dateFormat.parse("$fechaPublicacion")

    override fun toString(): String{
        return "Nombre de la cancion: $titulo \n" +
                "Artista: $artista \n" +
                "Fecha de publicacion: $fecha \n" +
                if (playsSong > 100){
                    "Cancion popular"
                 } else { "Total de reproducciones: $playsSong" }
    }
}
