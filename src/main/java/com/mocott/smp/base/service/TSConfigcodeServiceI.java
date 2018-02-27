package com.mocott.smp.base.service;
import com.mocott.smp.base.entity.TSConfigcodeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSConfigcodeServiceI extends CommonService{
	
 	public void delete(TSConfigcodeEntity entity) throws Exception;
 	
 	public Serializable save(TSConfigcodeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSConfigcodeEntity entity) throws Exception;

	public TSConfigcodeEntity getConfigValue(String configCode) throws Exception;

}
