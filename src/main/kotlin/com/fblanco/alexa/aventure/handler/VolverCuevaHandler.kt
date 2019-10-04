package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class VolverCuevaHandler : RequestHandler {

//    Pagina 10
    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("VolverCueva"))
    }

    val text = """ Entras en la extraña cueva y te detienes hasta que logras acostumbrarte a la tenue luz ambarina que ilumina su interior. Gradualmente empiezas a distinguir dos tuneles. Uno de ellos, el de la derecha, forma una curva hacia abajo. El otro sube en pendiente hacía la izquierda. Se te ocurre que el descendiente puede conducir al pasado y el que sube al futuro
                Quieres ir al tunes de la izquierda,o al tunel de la derecha  o salir  de la cueva
    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}

// izquierda 20
// Derecha 61
// Salir cueva 21