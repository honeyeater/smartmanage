package com.mocott.smp.trade.service;

import com.mocott.smp.trade.entity.UserUsdtInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface UserUsdtInfoServiceI extends CommonService{
	
 	public void delete(UserUsdtInfoEntity entity) throws Exception;
 	
 	public Serializable save(UserUsdtInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(UserUsdtInfoEntity entity) throws Exception;

    public UserUsdtInfoEntity queryUserUsdtByUserName(String username) throws Exception;

}
