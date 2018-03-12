package com.mocott.smp.trade.service;

import com.mocott.smp.trade.entity.UsdtTradeEntity;
import com.mocott.smp.trade.model.UsdtTradeInfo;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface UsdtTradeServiceI extends CommonService{
	
 	public void delete(UsdtTradeEntity entity) throws Exception;
 	
 	public Serializable save(UsdtTradeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(UsdtTradeEntity entity) throws Exception;

    public void saveBuy(UsdtTradeInfo usdtTradeInfo) throws Exception;

	public void saveSale(UsdtTradeInfo usdtTradeInfo) throws Exception;

    public void buyAudit(UsdtTradeEntity usdtTradeEntity, String auditFlag) throws Exception;

    public void saleAudit(UsdtTradeEntity usdtTradeEntity, String auditFlag) throws Exception;
}
