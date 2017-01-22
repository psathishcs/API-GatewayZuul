package org.zuul.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 
 * @author Sathish
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class APIGatewayApplication {
	public static void main(String[] args){
		SpringApplication.run(APIGatewayApplication.class, args);
	}
}
