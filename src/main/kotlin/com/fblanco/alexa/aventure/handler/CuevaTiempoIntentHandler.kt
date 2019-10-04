package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class CuevaTiempoIntentHandler : RequestHandler {
    // tiempo 114 + 61

    val text = """  En la risa del caballero hay un cierto tono que no te inspira confianza, por lo que le das las gracias amablemente diciendo que tienes asuntos que atender.
                    Entonces, ocúpate de ellos responde el caballero, pero procura mantenerlos más limpios que tu persona.
                    Se aleja a todo galope. Te alegras enormemente de haberte librado de él. Ansioso por buscar la entrada a la Cueva del Tiempo, subes por detrás del acantilado que desciende hasta el estanque. 
                    Después de una hora de búsqueda, encuentras un túnel que se adentra en la tierra.
                    Sigues el túnel hacia abajo durante una corta distancia. Resbalas, te golpeas la cabeza con algún objeto y pierdes el conocimiento.
                    Cuando vuelves en sí, te encuentras cerca de un pequeño lago rodeado de bosques. El único ser humano a la vista es un muchacho de unos doce años que está pescando. Te acercas y entablas conversación con él, con la esperanza de averiguar en qué año estás sin que le resultes extraño.
                    Afortunadamente, el muchacho resulta ser muy amable. Dice que se llama Nick Tyler y que vive en la calle Birch. Ayuda a su padre en la fabricación de jabones y velas, según él los mejores de las colonias.
                    
                    Quieres comentarle que vienes del futuro o prefieres idear una historía más creible

""".trimIndent()

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("CuevaTiempo"))
    }

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()




//Futuro 104
// Creible 106
}

