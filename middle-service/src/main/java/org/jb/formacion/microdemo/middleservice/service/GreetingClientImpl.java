package org.jb.formacion.microdemo.middleservice.service;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import org.jb.formacion.microdemo.middleservice.dto.GreetingResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@AllArgsConstructor
public class GreetingClientImpl implements GreetingClient {
    
    private static final String NAME_PARAM_KEY = "name";
    
    private static final String GREETING_SERVICE_URL = "http://greeting-service/greeting?name={name}";
    
    private RestTemplate restTemplate;
    
    @Override
    @HystrixCommand(fallbackMethod = "greetingFallback")
    public GreetingResponse greeting(String name) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(NAME_PARAM_KEY, name);
        return restTemplate.getForObject(GREETING_SERVICE_URL, GreetingResponse.class, parameters);
    }

    public GreetingResponse greetingFallback(String name) {
        return new GreetingResponse(name + ", an error occurred");
    }
}

