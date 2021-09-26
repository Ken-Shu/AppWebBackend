package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.service.dao.WatchListDao;
import com.service.model.WatchList;

@Path("/watchlist")
public class WatchListService {
	private WatchListDao watchListDao = new WatchListDao();
	@Path("/findall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<WatchList> findall() {
		return watchListDao.queryAllWatchList();
	}
}
