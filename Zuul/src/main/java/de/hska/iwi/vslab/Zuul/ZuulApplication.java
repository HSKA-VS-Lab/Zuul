package de.hska.iwi.vslab.Zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableDiscoveryClient // uses implementation of spring for discovery clients (like eureka)
@EnableEurekaClient // uses implementation of eureka
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

	// start the server, the eureka server and the core product service 
	// then open this in browser: http://localhost:8092/product/products
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

}
