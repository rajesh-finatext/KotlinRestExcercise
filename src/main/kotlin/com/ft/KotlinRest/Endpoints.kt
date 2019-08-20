package com.ft.KotlinRest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class Endpoints {
    var names = mutableSetOf<String>()

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting{
        if (!name.equals("World")) {
            names.add(name)
            counter.incrementAndGet()
        }
        return Greeting(counter.get(), "Hello, $name", names.joinToString())
    }
}