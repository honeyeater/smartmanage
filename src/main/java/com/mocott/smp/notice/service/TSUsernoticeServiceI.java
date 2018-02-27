package com.mocott.smp.notice.service;
import com.mocott.smp.notice.entity.TSUsernoticeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSUsernoticeServiceI extends CommonService{
	
 	public void delete(TSUsernoticeEntity entity) throws Exception;
 	
 	public Serializable save(TSUsernoticeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSUsernoticeEntity entity) throws Exception;
 	
}
