package org.jb.formacion.microdemo.greetingservice.service;

import org.jb.formacion.microdemo.greetingservice.dto.GreetingResponse;

    public interface GreetingService {
     
        public GreetingResponse greeting(String name);
    }

