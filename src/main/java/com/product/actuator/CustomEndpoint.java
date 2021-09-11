package com.product.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="products")
@Component
public class CustomEndpoint {
	
	@ReadOperation
	public String products(){
		return "This is custom endpoint for product";
	}
	
}