package com.service.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.service.model.WatchList;

public class WatchListDao {
private Connection conn = DBConn.conn;
	
	public List<WatchList> queryAllWatchList(){
		List<WatchList> watchLists = new ArrayList<>();
		String sql ="select id ,investid, stockpoolid, tdate from watchlist";
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql)){
			while(rs.next()) {
				Integer id = rs.getInt("id");
				Integer investid = rs.getInt("investid");
				Integer stockpoolid =rs.getInt("stockpoolid");
				Date tdate = rs.getDate("tdate");
				WatchList watchlist= new WatchList(id,investid,stockpoolid,tdate);
				watchLists.add(watchlist);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return watchLists;
	}
	public List<WatchList> queryByInvestorId(Integer investorid){
		List<WatchList> watchLists = new ArrayList<>();
		String sql ="select id ,investid, stockpoolid, tdate from watchlist where id="+investorid;
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql)){
			while(rs.next()) {
				Integer id = rs.getInt("id");
				Integer investid = rs.getInt("investid");
				Integer stockpoolid =rs.getInt("stockpoolid");
				Date tdate = rs.getDate("tdate");
				WatchList watchlist= new WatchList(id,investid,stockpoolid,tdate);
				watchLists.add(watchlist);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return watchLists;
	}
}
