package com.thoughtBucks.store

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun heroPage(model: Model): String {
        model["title"] = "ThoughBucks"
        model["content"] = "Welcome to ThoughtBucks"
        return "heroPage"
    }

}