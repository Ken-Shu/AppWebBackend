package com.service.model;

import java.util.Date;

public class StockPool {
	private Integer id;
	private Integer typeid;
	private String symbol;
	private String symbolname;
	private Integer warning;
	private Date tDate;
	
	//關聯資料 one to one
	private StockPool stockpool;
	
	public StockPool(Integer id, Integer typeid, String symbol, String symbolname, Integer warning, Date tDate) {
		super();
		this.id = id;
		this.typeid = typeid;
		this.symbol = symbol;
		this.symbolname = symbolname;
		this.warning = warning;
		this.tDate = tDate;
	}
	public StockPool() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSymbolname() {
		return symbolname;
	}
	public void setSymbolname(String symbolname) {
		this.symbolname = symbolname;
	}
	public Integer getWarning() {
		return warning;
	}
	public void setWarning(Integer warning) {
		this.warning = warning;
	}
	public Date gettDate() {
		return tDate;
	}
	public void settDate(Date tDate) {
		this.tDate = tDate;
	}
	@Override
	public String toString() {
		return "StockPool [id=" + id + ", typeid=" + typeid + ", symbol=" + symbol + ", symbolname=" + symbolname
				+ ", warning=" + warning + ", tDate=" + tDate + "]";
	}
	
}
