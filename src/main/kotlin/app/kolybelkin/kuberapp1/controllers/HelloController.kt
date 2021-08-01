package app.kolybelkin.kuberapp1.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController() {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }
}

