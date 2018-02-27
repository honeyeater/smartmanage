package com.mocott.smp.base.service;
import com.mocott.smp.base.entity.FrontVerifyCodeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FrontVerifyCodeServiceI extends CommonService{
	
 	public void delete(FrontVerifyCodeEntity entity) throws Exception;
 	
 	public Serializable save(FrontVerifyCodeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FrontVerifyCodeEntity entity) throws Exception;
 	
}
