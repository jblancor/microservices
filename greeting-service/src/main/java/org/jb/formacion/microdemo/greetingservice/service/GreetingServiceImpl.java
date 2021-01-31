package org.jb.formacion.microdemo.greetingservice.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.jb.formacion.microdemo.greetingservice.dto.GreetingResponse;

@Service
public class GreetingServiceImpl implements GreetingService {
    //${greeting.message}
    @Value(value = "hola")
    String baseMessage;
    
    @Override
    public GreetingResponse greeting(String name) {
        String message = baseMessage + " " + name;
        return new GreetingResponse(message);
    }
}

