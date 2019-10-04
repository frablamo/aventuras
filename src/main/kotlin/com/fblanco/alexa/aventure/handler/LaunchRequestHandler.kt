package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.LaunchRequest
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class LaunchRequestHandler : RequestHandler {

    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.requestType(LaunchRequest::class.java))
    }


    //PAGINA 2-3

    override fun handle(input: HandlerInput): Optional<Response> {
        val text =
            """Ya habías pasado en anteriores ocasiones por el Cañón de la Serpiente, cuando ibas en bicicleta a visitar a tu tio Howard en el rancho Red Creek, pero nunca te habias fijado en la  entrada de la cueva. 
                Parece como si un desprendimiento de rocas la hubiese dejado al descubierto recientemente. 
                El sol de la tarde ilumina la entrada de la cueva, pero su interior permanece en la más absoluta oscuridad. 
                Das unos pasos hacia dentro para hacerte una idea de su tamaño. A medida que te vas acostumbrando a la oscuridad, empiezas a vislumbrar una especie de túnel iluminado débilmente por algún tipo de material fosforescente incrustado en las rocas. Las paredes del túnel tienen una forma suave, como si hubiesen sido modeladas por el curso del agua. Cinco o seis metros más adelante, el túnel describe una curva. Te preguntas a dónde conduce. Das unos pasos más. Te pone nervioso estar solo en un lugar tan extraño. Das la vuelta y sales corriendo al exterior.
                A juzgar por la oscuridad que reina en el exterior, está a punto de desencadenarse una tormenta. De pronto, te das cuenta que el, sol ya se ha puesto y que la única iluminación procede de la pálida luna llena. Quizás has debido quedarte dormido un par de horas. Entonces recuerdas algo que todavía te resulta mucho más extraño: la noche anterior, la luna apenas estaba empezando su cuarto creciente. 
                Empiezas a dudar del tiempo que has pasado dentro de la cueva. No tienes hambre, ni te parece que hayas podido quedarte dormido. No sabes si intentar volver a casa guiado por la luz de la luna o si esperar a que amanezca para no correr el riesgo de resbalar en el escarpado sendero.
                
                Quieres ir a casa, o  prefieres esperar?"""
        return input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(false)
            .build()
    }

    //CasaIntentHandler
    //EsperarIntentHandler

}


