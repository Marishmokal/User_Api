package com.prowings.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.prowings.model.ProductConsumer;
import com.prowings.service.ProductConsumerService;

@RestController
public class ProductConsumerController {

	@Autowired
	ProductConsumerService productConsumerService;
	
	@PostMapping("/consumer")
	public ProductConsumer callByCreateConsumer(@RequestBody ProductConsumer productConsumer) throws RestClientException, URISyntaxException
	{
		return productConsumerService.callByCreateConsumer(productConsumer);
	}
}
