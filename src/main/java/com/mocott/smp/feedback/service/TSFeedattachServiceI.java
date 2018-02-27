package com.mocott.smp.feedback.service;
import com.mocott.smp.feedback.entity.TSFeedattachEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSFeedattachServiceI extends CommonService{
	
 	public void delete(TSFeedattachEntity entity) throws Exception;
 	
 	public Serializable save(TSFeedattachEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSFeedattachEntity entity) throws Exception;
 	
}
