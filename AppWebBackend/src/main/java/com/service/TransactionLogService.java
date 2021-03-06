package com.service;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.service.model.TransactionLog;
import com.service.dao.TransactionLogDao;

@Path("/transactionlog")
public class TransactionLogService {
private TransactionLogDao transactionLogDao = new TransactionLogDao();

@Path("/findall")
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<TransactionLog> findall(){
	return transactionLogDao.queryAllTransactionLog();
}
}
