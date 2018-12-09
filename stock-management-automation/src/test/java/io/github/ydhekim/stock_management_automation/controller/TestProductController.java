package io.github.ydhekim.stock_management_automation.controller;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import io.github.ydhekim.stock_management_automation.model.Product;

public class TestProductController {

	@Test
	public void addProductTest() throws SQLException {
		Product product = new Product();
		product.setId(11);
		product.setName("sn");
		product.setAmount(5);
		product.setType("test");

		ProductController pc = new ProductController();

		boolean result = pc.add(product);
		assertEquals(true, result);
	}

	@Test
	public void showProductTest() throws SQLException {
		int id = 11;
		// Aynı sonucun dönmesini bekliyoruz.
		Product product = new Product();
		product.setId(11);
		product.setName("sn");
		product.setAmount(5);
		product.setType("test");

		ProductController pc = new ProductController();
		Product result = pc.show(id);

		assertEquals(product, result);
	}

}
