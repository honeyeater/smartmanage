package com.mocott.smp.user.service;
import com.mocott.smp.user.entity.FrontUserMemberEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FrontUserMemberServiceI extends CommonService{
	
 	public void delete(FrontUserMemberEntity entity) throws Exception;
 	
 	public Serializable save(FrontUserMemberEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FrontUserMemberEntity entity) throws Exception;
 	
}
