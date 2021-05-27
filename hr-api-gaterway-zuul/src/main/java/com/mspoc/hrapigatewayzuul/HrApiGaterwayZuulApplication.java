package com.mspoc.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGaterwayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGaterwayZuulApplication.class, args);
	}

}
