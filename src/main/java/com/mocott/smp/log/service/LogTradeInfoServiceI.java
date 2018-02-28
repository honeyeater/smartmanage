package com.mocott.smp.log.service;
import com.mocott.smp.log.entity.LogTradeInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface LogTradeInfoServiceI extends CommonService{
	
 	public void delete(LogTradeInfoEntity entity) throws Exception;
 	
 	public Serializable save(LogTradeInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(LogTradeInfoEntity entity) throws Exception;

	public void updateByUserName(String userName) throws Exception;
}
