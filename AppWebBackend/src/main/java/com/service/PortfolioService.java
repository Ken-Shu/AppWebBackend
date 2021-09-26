package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.service.dao.PortfolioDao;
import com.service.model.Portfolio;

@Path("/portfolio")
public class PortfolioService {
private PortfolioDao portfolioDao = new PortfolioDao();

@Path("/findall")
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Portfolio> findall(){
	return portfolioDao.queryAllPortfolio();
}
}
