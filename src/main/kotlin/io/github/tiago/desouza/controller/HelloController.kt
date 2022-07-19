package io.github.tiago.desouza.controller

import io.github.tiago.desouza.controller.dto.RequestDto
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"
    }

    @Post
    fun create(
        @Body request: RequestDto
    ): String {
        return request.toString()
    }
}