package com.prowings.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.prowings.model.ProductConsumer;

@Service
public class ProductConsumerServiceImpl implements ProductConsumerService {

	
	RestTemplate template=new RestTemplate();
	
	@Autowired
	@Value("${base.url}")
	String url;
	
	
	@Override
	public ProductConsumer callByCreateConsumer(ProductConsumer productConsumer) throws RestClientException, URISyntaxException {
		
		return template.postForObject(new URI(url), productConsumer,ProductConsumer.class);
	}

	
	
}
