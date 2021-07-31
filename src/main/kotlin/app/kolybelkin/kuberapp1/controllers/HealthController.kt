package app.kolybelkin.kuberapp1.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthController {

    @GetMapping
    fun health(): HealthResponse = HealthResponse()

    data class HealthResponse(val status: String = "OK")
}