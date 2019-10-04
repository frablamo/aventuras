package com.fblanco.alexa.aventure.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import java.util.Optional

class EscaparHandler : RequestHandler {


    override fun canHandle(input: HandlerInput): Boolean {
        return input.matches(Predicates.intentName("Escapar"))
    }


    val text = """ No ves ninguna posibilidad de futuro entre estas gentes primitivas, por lo que echas a correr de vuelta hacia la Cueva del Tiempo.
                   Afortunadamente no te persiguen y logras rehacer el camino. Estás de nuevo en la cueva, agotado y hambriento. La luz es incluso más tenue que antes y te ves obligado a buscar a tientas el camino Tropiezas y te caes de cabeza por un terraplen lastimándote ligeramente. Al levantar la vista, ves la luz del día. 
                   Poco después sales de la cueva a un terreno cálido y húmedo cercano a un bosque de frondosos árboles. Pasa volando un pájaro. No sabes en que época estás, pero el paisaje parece bastante agradable.
    
                   De pronto oyes unos gritos. Te escondes en un matorral. Aparece un animal, seguido por varios hombres con lanzas y hondas. Te figuras que debes encontrarte en alguna época anterior al desarrollo de la civilización. Sigues un sendero que te conduce hasta un claro y allí te tumbas en la hierba para descansar un rato. Al mirar hacia el cielo, descubres una larga franja blanquecina. Te frotas los ojos y
                   vuelves a mirar. Parece la estela de un avión a reacción Después de todo, puede que te encuentres en tu propia época.
            
                   Cansado de vagar durante varios dias por la jungla, llegas a un poblado situado a orillas de un gran río. Cerca hay un aeropuerto y, al cabo de algún tiempo, logras volar hacia tu civilización y ver a tu familia, exactamente un
                   mes después de haber entrado por primera vez en la Cueva del Tiempo. Te alegras de estar de nuevo en casa, aunque te sorprende encontrar a todos mucho más viejos. Ellos también se asombran de que no hayas cambiado nada en once años

                   FIN    
    """.trimIndent()

    override fun handle(input: HandlerInput): Optional<Response> {
        return input.responseBuilder
            .withSpeech(text)
            .withShouldEndSession(true)
            .build()
    }

    //PAGINA 28 - 51
}

