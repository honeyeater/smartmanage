package com.mocott.smp.user.service;
import com.mocott.smp.user.entity.FrontUserActivatecodeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FrontUserActivatecodeServiceI extends CommonService{
	
 	public void delete(FrontUserActivatecodeEntity entity) throws Exception;
 	
 	public Serializable save(FrontUserActivatecodeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FrontUserActivatecodeEntity entity) throws Exception;
 	
}
