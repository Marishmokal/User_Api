package com.prowings.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.prowings.model.ProductConsumer;

public interface ProductConsumerService {

	ProductConsumer callByCreateConsumer(ProductConsumer productConsumer) throws RestClientException, URISyntaxException;

}
