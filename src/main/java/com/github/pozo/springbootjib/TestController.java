package com.github.pozo.springbootjib;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class TestController {

    @GetMapping(value = "/echo/{text}")
    public ResponseEntity test(@NotNull @PathVariable String text) {
        return ResponseEntity.ok(text);
    }

    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok("HELLO");
    }
}
