package com.mocott.smp.log.service;
import com.mocott.smp.log.entity.LogPayInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface LogPayInfoServiceI extends CommonService{
	
 	public void delete(LogPayInfoEntity entity) throws Exception;
 	
 	public Serializable save(LogPayInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(LogPayInfoEntity entity) throws Exception;
 	
}
