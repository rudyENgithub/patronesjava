package com.rudysorto.patrones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public Connection conn = null;
	
	private String dbName = null;

	public Database() {
	}

	public Database(String dbName, String dbURL) {
		this.dbName = dbName;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			this.conn = DriverManager.getConnection(dbURL, "usaid", "usaid");// here put the new
															// simple url.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet runSql(String sql) throws SQLException {
		Statement sta = conn.createStatement();
		return sta.executeQuery(sql);
	}

}
