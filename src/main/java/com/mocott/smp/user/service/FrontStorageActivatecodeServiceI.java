package com.mocott.smp.user.service;

import com.mocott.smp.user.entity.FrontStorageActivatecodeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.List;

public interface FrontStorageActivatecodeServiceI extends CommonService{
	
 	public void delete(FrontStorageActivatecodeEntity entity) throws Exception;
 	
 	public Serializable save(FrontStorageActivatecodeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FrontStorageActivatecodeEntity entity) throws Exception;

	public List<FrontStorageActivatecodeEntity> getByActivateCode(String activatecode) throws Exception;
}
