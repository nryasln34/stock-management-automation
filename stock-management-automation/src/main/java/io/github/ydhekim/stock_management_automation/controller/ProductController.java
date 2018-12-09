package io.github.ydhekim.stock_management_automation.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.github.ydhekim.stock_management_automation.model.Product;

public class ProductController {
	public boolean add(Product p) throws SQLException {
		ConnectionController cC = new ConnectionController();
		cC.Connect();
		Connection conn = cC.conn;
		Statement statement = conn.createStatement();
		String sql = "INSERT INTO product VALUES(" + p.getId() + "," + p.getName() + "," + p.getAmount() + ","
				+ p.getType() + ")";
		Boolean result = statement.execute(sql);
		
		return result;
	}

	public Product show(int id) throws SQLException {
		ConnectionController cC = new ConnectionController();
		cC.Connect();
		Connection conn = cC.conn;
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM PRODUCT WHERE id='" + id + "'";
		ResultSet result = statement.executeQuery(sql);
		Product prod = new Product();
		prod.setId(result.getInt("id"));
		prod.setName(result.getString("name"));
		prod.setType(result.getString("type"));
		prod.setAmount(result.getInt("amount"));

		return prod;
	}
}
