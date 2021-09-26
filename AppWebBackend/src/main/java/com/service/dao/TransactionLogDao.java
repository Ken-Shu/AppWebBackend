package com.service.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.service.model.TransactionLog;

public class TransactionLogDao {
private Connection conn = DBConn.conn;
	
	public List<TransactionLog> queryAllTransactionLog(){
		List<TransactionLog> transactionLogs = new ArrayList<>();
		String sql = "select id ,investid,stockpoolid,bs,price,amount,tdate from transactionlog";
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql)){
			while(rs.next()) {
			 Integer id = rs.getInt("id");
			 Integer investid = rs.getInt("investid");
			 Integer stockpoolid = rs.getInt("stockpoolid");
			 String bs = rs.getString("bs");
			 Double price = rs.getDouble("price");
			 Integer amount = rs.getInt("amount");
			 Date tdate = rs.getDate("tdate");
			 TransactionLog transactionLog = new TransactionLog(id, investid, stockpoolid, bs, price, amount, tdate);
			 transactionLogs.add(transactionLog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactionLogs;
	}
	public List<TransactionLog> queryByInvestorId(Integer investorId){
		List<TransactionLog> transactionLogs = new ArrayList<>();
		String sql = "select id ,investid,stockpoolid,bs,price,amount,tdate from transactionlog where investid ="+investorId;
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql)){
			while(rs.next()) {
			 Integer id = rs.getInt("id");
			 Integer investid = rs.getInt("investid");
			 Integer stockpoolid = rs.getInt("stockpoolid");
			 String bs = rs.getString("bs");
			 Double price = rs.getDouble("price");
			 Integer amount = rs.getInt("amount");
			 Date tdate = rs.getDate("tdate");
			 TransactionLog transactionLog = new TransactionLog(id, investid, stockpoolid, bs, price, amount, tdate);
			 transactionLogs.add(transactionLog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transactionLogs;
	}
}
