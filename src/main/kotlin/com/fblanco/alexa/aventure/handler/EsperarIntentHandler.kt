package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class EsperarIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("Esperar"))
    }

    //PAGINA 5

    val text = """ Esperas hasta la mañana siguiente, pero, a medida que los rosados jirones del amanecer iluminan el cielo por el este, empieza a soplar un viento helado y amenazador.
        Quieres buscar refugio o prefieres soportar el viento
    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}
//RefugioIntentHandler
//SoportarVientoHandler