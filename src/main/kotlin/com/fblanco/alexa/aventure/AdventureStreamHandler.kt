package com.fblanco.alexa.aventure

import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import com.fblanco.alexa.aventure.handler.CancelAndStopIntentHandler
import com.fblanco.alexa.aventure.handler.CasaIntentHandler
import com.fblanco.alexa.aventure.handler.CuevaTiempoIntentHandler
import com.fblanco.alexa.aventure.handler.EntrarEnCuevaHandler
import com.fblanco.alexa.aventure.handler.EscaparHandler
import com.fblanco.alexa.aventure.handler.LaunchRequestHandler
import com.fblanco.alexa.aventure.handler.NoIntentHandler
import com.fblanco.alexa.aventure.handler.EsperarIntentHandler
import com.fblanco.alexa.aventure.handler.RanchoIntentHandler
import com.fblanco.alexa.aventure.handler.RefugioIntentHandler
import com.fblanco.alexa.aventure.handler.SeguirAndandoHandler
import com.fblanco.alexa.aventure.handler.SoportarVientoHandler
import com.fblanco.alexa.aventure.handler.VolverCuevaHandler
import com.kinisoftware.upcomingMovies.interceptor.LogRequestInterceptor
import com.kinisoftware.upcomingMovies.interceptor.LogResponseInterceptor

class AdventureStreamHandler() : SkillStreamHandler(skill) {
    companion object {

        private val skill = Skills.standard()
            .addRequestInterceptor(LogRequestInterceptor())
            .addResponseInterceptor(LogResponseInterceptor())
            .addRequestHandlers(
                LaunchRequestHandler(),
                CasaIntentHandler(),
                EsperarIntentHandler(),
                RefugioIntentHandler(),
                SoportarVientoHandler(),
                CuevaTiempoIntentHandler(),
                CancelAndStopIntentHandler(),
                EntrarEnCuevaHandler(),
                VolverCuevaHandler(),
                RanchoIntentHandler(),
                EscaparHandler(),
                SeguirAndandoHandler(),
                NoIntentHandler()
            ).build()
    }
}
