package com.service.model;

import java.util.Date;

public class RealTimeStock {
	// 盤中即時資訊
		private String symbol;
		private Double bid; // 買價
		private Double ask; // 賣價
		private Double lastprice; // 最後成交價
		private Double change; // 漲跌
		private Double changePercent; // 漲跌幅
		private Long volume; // 總量
		private Date transdate; // 最後交易時間
		
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public Double getBid() {
			return bid;
		}
		public void setBid(Double bid) {
			this.bid = bid;
		}
		public Double getAsk() {
			return ask;
		}
		public void setAsk(Double ask) {
			this.ask = ask;
		}
		public Double getLastprice() {
			return lastprice;
		}
		public void setLastprice(Double lastprice) {
			this.lastprice = lastprice;
		}
		public Double getChange() {
			return change;
		}
		public void setChange(Double change) {
			this.change = change;
		}
		public Double getChangePercent() {
			return changePercent;
		}
		public void setChangePercent(Double changePercent) {
			this.changePercent = changePercent;
		}
		public Long getVolume() {
			return volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public Date getTransdate() {
			return transdate;
		}
		public void setTransdate(Date transdate) {
			this.transdate = transdate;
		}

}
