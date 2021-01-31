package org.jb.formacion.microdemo.greetingservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.jb.formacion.microdemo.greetingservice.service.GreetingService;
import org.jb.formacion.microdemo.greetingservice.dto.GreetingResponse;
import org.springframework.http.ResponseEntity;

@RestController
@AllArgsConstructor
@RequestMapping(
        value = {
            "/greeting"
        })
public class GreetingController {
    
    private GreetingService greetingService;
    
    @GetMapping
    public ResponseEntity<GreetingResponse> greeting(@RequestParam(
            value = "name") String name) {
        return ResponseEntity.ok(greetingService.greeting(name));
    }
}

