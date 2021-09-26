package com.service.model;

import java.util.Date;

public class Portfolio {
	private Integer id;
	private Integer investid;
	private Integer stockpoolid;
	private Double price;
	private Integer amount;
	private Date tDate;
	
	public Portfolio(Integer id, Integer investid, Integer stockpoolid, Double price, Integer amount, Date tDate) {
		super();
		this.id = id;
		this.investid = investid;
		this.stockpoolid = stockpoolid;
		this.price = price;
		this.amount = amount;
		this.tDate = tDate;
	}

	public Portfolio() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInvestid() {
		return investid;
	}

	public void setInvestid(Integer investid) {
		this.investid = investid;
	}

	public Integer getStockpoolid() {
		return stockpoolid;
	}

	public void setStockpoolid(Integer stockpoolid) {
		this.stockpoolid = stockpoolid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date gettDate() {
		return tDate;
	}

	public void settDate(Date tDate) {
		this.tDate = tDate;
	}

	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", investid=" + investid + ", stockpoolid=" + stockpoolid + ", price=" + price
				+ ", amount=" + amount + ", tDate=" + tDate + "]";
	}
	
	
}
