package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class RefugioIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("Refugio"))
    }

    val text = """ Buscas refugio en un hueco entre las rocas para protegerte de las terribles ráfagas de viento y te recuestas en su fondo. De repente, la roca se desmorona y resbalas por una pendiente fangosa hasta un estanque.
                   Cuando logras levantarte, calado hasta los huesos, y llegar hasta la hierba que cubre la orilla, el sol brilla con todo su esplendor. Miras hacia las rocas que se elevan por detrás del estanque, pero no logras descubrir por dónde has podido caer.
                   Tratas de hacerte una idea de tu situación, cuando de pronto aparece un caballo montado por un caballero con armadura, como los de los libros de historia. La visión te resulta tan inusitada que te dan ganas de echarte a reír. El caballero levanta su casco e irrumpe en sonoras carcajadas.
                    
                    ¡Menudo sitio para tomar un baño! grita. De todos modos, opino que ha valido la pena, ¡Has quedado tan limpio como un cerdo!
                    Está a punto de caerse del caballo a causa de las fuertes carcajadas. 
                    Anda, sube y te llevaré de vuelta al castillo. Veremos qué se puede hacer para que recuperes un aspecto humano.
                    
                    Quieres volver a caballo al castillo o prefieres volver a la Cueva del Tiempo

    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}
// Castillo 22
//VolverCuevaHandler