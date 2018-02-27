package com.mocott.smp.user.service;
import com.mocott.smp.user.entity.FrontUserRegisterEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FrontUserRegisterServiceI extends CommonService{
	
 	public void delete(FrontUserRegisterEntity entity) throws Exception;
 	
 	public Serializable save(FrontUserRegisterEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FrontUserRegisterEntity entity) throws Exception;

    public FrontUserRegisterEntity checkUserExits(FrontUserRegisterEntity user);
}
