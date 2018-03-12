package com.mocott.smp.base.service;

import com.mocott.smp.base.entity.UsdtBankEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface UsdtBankServiceI extends CommonService{
	
 	public void delete(UsdtBankEntity entity) throws Exception;
 	
 	public Serializable save(UsdtBankEntity entity) throws Exception;
 	
 	public void saveOrUpdate(UsdtBankEntity entity) throws Exception;
 	
}
