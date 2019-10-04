package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class CasaIntentHandler : RequestHandler {

    //PAGINA 4

    val text = """A medida que avanzas hacia el rancho, tienes la sensación de que el sendero no es el
    que tú recuerdas, aunque desde luego la luz de la luna puede darle un aspecto diferente. De pronto, te das cuenta que no estás caminando por un sendero, sino por algo que se asemeja al cauce seco de un río. 
    Vuelves corriendo a la entrada de la cueva. Miras a tu alrededor y descubres que todo el paisaje ha cambiado. 
    Parece como si una lluvia torrencial hubiese borrado todo el rastro del camino durante el rato que has estado dentro de la cueva, a pesar de que no logras ver un solo charco. 
    Tiemblas; hace frío, mucho más del que corresponde a esta época del año. Te pones la chaqueta que llevabas en la mochila, pero sigues sintiendo un frío terrible. 
    Por fin, el paisaje empieza a aclararse. Por el este asoma un poco de luz. Pronto saldrá el sol. 
    Echas un vistazo a tu reloj y descubres que se ha parado, a pesar de que sólo hace unas horas que le has dado cuerda. Parece que nada funcione correctamente. 
     Sabes que debes volver al rancho lo antes posible, pero de algún modo, sientes que la única forma de hacer que las cosas vuelvan a ser como antes es retornar al interior de la cueva.
    
     Quieres ir hacía el rancho o prefieres volver a la cueva""".trimIndent()

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("Casa"))
    }

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()

//RanchoIntentHandler,
//VolverCuevaHandler
}

