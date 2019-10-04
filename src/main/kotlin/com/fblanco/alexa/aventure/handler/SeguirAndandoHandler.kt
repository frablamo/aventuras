package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class SeguirAndandoHandler : RequestHandler {

//    Pagina 18-19
    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("SeguirAndando"))
    }

    val text = """ Sigues adelante por un sendero que sube una empinada cuesta. Puedes Oir unos fuertes sonidos que llegan desde un barranco cercano; probablemente pertenecen a algun animal
de gran tamaño. Trepas a un risco y contemplas uno de los mayores mamiferos terrestres que haya existido jamás: el mamut lanudo. Su impresionante volumen resulta todavía mucho mayor debido a la espesa capa de pelo que le cubre.

Quieres Saltar sobre el mamut o prefieres seguri a pie
    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}
//Saltar sobre el mamut 29
// Seguir a pie 30