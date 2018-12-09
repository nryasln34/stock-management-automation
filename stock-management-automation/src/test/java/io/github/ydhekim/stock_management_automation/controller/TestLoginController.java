package io.github.ydhekim.stock_management_automation.controller;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class TestLoginController {

	@Test
	public void loginTest() throws SQLException {
		LoginController lg = new LoginController();
		String username = "test";
		String password = "password";
		boolean result = lg.login(username, password);
		assertEquals(true, result);
	}

	@Test
	public void logoutTest() {
		LoginController lg = new LoginController();
		boolean result = lg.logout();
		assertEquals(true, result);
	}

}
