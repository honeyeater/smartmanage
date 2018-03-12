package com.mocott.smp.log.service;

import com.mocott.smp.log.entity.LogOrderInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.List;

public interface LogOrderInfoServiceI extends CommonService{
	
 	public void delete(LogOrderInfoEntity entity) throws Exception;
 	
 	public Serializable save(LogOrderInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(LogOrderInfoEntity entity) throws Exception;

	public List<LogOrderInfoEntity> getOrderListDesc(String userName) throws Exception;
}
