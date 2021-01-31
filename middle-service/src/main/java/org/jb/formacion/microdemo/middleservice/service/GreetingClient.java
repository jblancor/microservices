package org.jb.formacion.microdemo.middleservice.service;

import org.jb.formacion.microdemo.middleservice.dto.GreetingResponse;

public interface GreetingClient {

    public GreetingResponse greeting(String name);
}

