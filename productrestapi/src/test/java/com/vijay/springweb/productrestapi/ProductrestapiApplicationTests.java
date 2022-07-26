package com.vijay.springweb.productrestapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.vijay.springweb.productrestapi.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Test
	void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		assertNotNull(product);
		assertEquals("IPhone", product.getName());
	}

	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("XP-PEN_TAB");
		product.setDescription("Be the top artist in world");
		product.setPrice(25);
		Product newProduct = restTemplate.postForObject("http://localhost:8080/productapi/products", product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
	}

	@Test
	void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		product.setPrice(789);
		restTemplate.put("http://localhost:8080/productapi/products", product);
	}

}
