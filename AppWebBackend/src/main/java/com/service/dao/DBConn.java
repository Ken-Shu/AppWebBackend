package com.service.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
public static Connection conn;
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		//2. dburl user password
		String dburl = "jdbc:mysql://localhost:3306/invest?zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
		String userString = "app";
		String password = "12345678";
		Connection conn = DriverManager.getConnection(dburl,userString,password);	
	} catch (Exception e) {
		
	}
	
}
}
