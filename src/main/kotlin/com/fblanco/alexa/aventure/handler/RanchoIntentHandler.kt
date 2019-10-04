package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class RanchoIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("Rancho"))
    }
    //PAGINA 8

    val text = """A medida que aclara el día te das cuenta
que no estás en el buen camino. El cañón parece menos profundo y el cauce del río está sembrado de cantos rodados que nunca habías visto. El viento es helado a pesar de estar en
pleno verano. Al subir a un terreno más elevado descubres manchas de nieve. Desde un risco, divisas una llanura árida con lagos helados y, a lo lejos, una cadena montañosa con picos cubiertos por la nieve. Empiezas a pensar que
no se trata simplemente de que te hayas perdido; te has perdido en el tiempo y, por alguna extraña razón, has sido transportado varios millones de años atrás a la Edad del Hielo.
 
Te díriges a una de las colinas que bordean el canon, buscando un lugar para resguardarte del viento y descubres la entrada de otra cueva. Sientes la tentación de penetrar en ella aunque piensas que deberías seguir andando para ver si de algún modo logras llegar a un Sitio conocido.


     Quieres entrar en la cueva o seguir andando""".trimIndent()


    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}

//
//EntrarEnCuevaHandler
//SeguirAndandoHandler
