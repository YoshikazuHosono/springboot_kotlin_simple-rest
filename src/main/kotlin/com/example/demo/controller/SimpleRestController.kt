package com.example.demo.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/simple")
class SimpleRestController {

    @GetMapping("/get")
    fun get(): String {
        return "hello!"
    }

    @GetMapping("/get2")
    fun get2(@RequestParam name: String): String {
        return "hello ${name}!"
    }

    @GetMapping("/get3")
    fun get3(@ModelAttribute request: Get3Request): String {
        return "hello ${request.name}!"
    }

}

data class Get3Request(
        val name: String
)