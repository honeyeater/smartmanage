package com.mocott.smp.notice.service;
import com.mocott.smp.notice.entity.TSUserquestionEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSUserquestionServiceI extends CommonService{
	
 	public void delete(TSUserquestionEntity entity) throws Exception;
 	
 	public Serializable save(TSUserquestionEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSUserquestionEntity entity) throws Exception;
 	
}
