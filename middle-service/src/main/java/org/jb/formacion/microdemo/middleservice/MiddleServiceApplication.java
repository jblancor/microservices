package org.jb.formacion.microdemo.middleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//Hystrix  implements Circuit Breaker pattern (in the example, next line is enabled but only on code not in explanation)
//@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class MiddleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddleServiceApplication.class, args);
	}

}
