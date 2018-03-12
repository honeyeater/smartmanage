package com.mocott.smp.trade.service;

import com.mocott.smp.trade.entity.UsdtPriceEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface UsdtPriceServiceI extends CommonService{
	
 	public void delete(UsdtPriceEntity entity) throws Exception;
 	
 	public Serializable save(UsdtPriceEntity entity) throws Exception;
 	
 	public void saveOrUpdate(UsdtPriceEntity entity) throws Exception;

	public UsdtPriceEntity getNewPrice() throws Exception;
}
