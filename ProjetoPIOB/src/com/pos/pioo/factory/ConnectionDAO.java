package com.pos.pioo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {

	private Connection con;
	public ConnectionDAO() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
			                                   "user=root&password=@Leandro123");
	}
	public Connection getCon() {
		return con;
	}
	
}
