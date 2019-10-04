package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class SoportarVientoHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("SoportarViento"))
    }

    val text = """ Trepas resueltamente por un risco rocoso.El fuerte viento levanta remolinos de nieve y choca violentamente contra tu cuerpo.
                   El mundo parece haber cambiado para mal. Si no encuentras pronto una casa o una cabaﬁa con gente que te ayude, no vivirás mucho.
                   Meditando sobre tu destino, tropiezas y tecaes, hundiéndote en una grieta. Pierdes el conocimiento y, al volver en sí, te encuentras en un lugar más cálido aunque todavía sigues tiritando.
                   Por la pálida luz ambarina deduces que, de algún modo, has ido a parar de nuevo a laCueva del TIempo. Hay un pasaje a tu derecha y otro a la izquierda.
                   
                   ¿ Será que uno conduce al futuro y el otro al pasado ?
                    
                    Quieres entrar en el pasaje de la izquierda o prefieres entrar en el pasaje de la derecha
    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> =
        input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
}
//
//izquierda 24
// derecha 25