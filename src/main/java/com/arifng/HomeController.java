package com.arifng;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World");
    }

    @Get("/ping")
    @Produces("application/json")
    public String hello() {
        return "pong";
    }
}
