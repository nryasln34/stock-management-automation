package io.github.ydhekim.stock_management_automation.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {

	public boolean login(String username, String password) throws SQLException {
		ConnectionController cC = new ConnectionController();
		cC.Connect();
		Connection conn = cC.conn;
		Statement statement = conn.createStatement();
		String sql = "Select * from EMPLOYEE Where username='" + username + "' and password='" + password + "'";
		if (statement.execute(sql)) {
			return true;
		}
		return false;
	}
	
	public boolean logout() {
		//Burası henüz yazılmadı login logout detaylı bir şekilde ele alınmalı
		return true;
	}

}
