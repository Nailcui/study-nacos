package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author dingyu
 * @date 2021-08-24 23:17
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("ok");
    }

}
