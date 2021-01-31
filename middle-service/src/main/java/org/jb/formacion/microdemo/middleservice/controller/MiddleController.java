package org.jb.formacion.microdemo.middleservice.controller;

import org.jb.formacion.microdemo.middleservice.dto.GreetingResponse;
import org.jb.formacion.microdemo.middleservice.service.GreetingClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@RestController
@AllArgsConstructor
@RequestMapping(
        value = {
            "/middle"
        })
public class MiddleController {
    
    private GreetingClient greetingClient;
    
    @GetMapping(
            value = {
                "/greeting"
            })
    public ResponseEntity<GreetingResponse> greeting(@RequestParam(
            value = "name") String name) {
        return ResponseEntity.ok(greetingClient.greeting(name));
    }
}

