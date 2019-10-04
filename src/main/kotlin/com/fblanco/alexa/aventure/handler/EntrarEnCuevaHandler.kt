package com.fblanco.alexa.aventure.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional


class EntrarEnCuevaHandler: RequestHandler {

	//PAGINA 17


	override fun canHandle(input: HandlerInput): Boolean {
		return input.matches(Predicates.intentName("EntrarEnCueva"))
	}


	val text = """Al penetrar en la cueva percibes una luz oscilante y olor a humo. Caminas a lo largo de un tortuoso pasadizo hasta llegar a una amplia cámara. El humo procede de unas vasijasde barro.
                  Unos hombres bajos y robustos, con pelo negro, muy lacio y rasgos primitivos, están ocupados pintando sobre las paredes de la cueva. Visten con pieles de animales. Obsevas que en un rincón hay varios lechos de paja.
                  Te quedas paralizado Por el miedo cuando los habitantes de la cueva abandonan su trabajo bajo para correr hacia ti con muestras de asombro. El mas alto lleva en sus manos una larga liana. Se adelanta como si tuviera intencon de agarrarte y atarte con ella.

                Quieres quedarte y entablar amistad o prefieres huir
    """.trimIndent()


	override fun handle(input: HandlerInput): Optional<Response> =
			input.responseBuilder
					.withSpeech(text)
			.withShouldEndSession(false)
            .build()

//Entablar amistad 26
//	EscaparHandler

}

