package com.service.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.service.model.Investor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InvestorDao {
	private Connection conn = DBConn.conn;
	
	public List<Investor> queryAllInvestor(){
		List<Investor> investors = new ArrayList<>();
		String sqlString ="select id , username, email,tdate from investor";
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery("")){
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String username = rs.getString("username");
				String email = rs.getString("email");
				Date tdate = rs.getDate("tdate");
				Investor investor = new Investor(id,username,email,tdate);
				investors.add(investor);
			}
		} catch (Exception e) {
			
		}
		return investors;
	}
}