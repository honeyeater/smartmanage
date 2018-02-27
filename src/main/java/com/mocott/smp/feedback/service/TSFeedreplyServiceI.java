package com.mocott.smp.feedback.service;
import com.mocott.smp.feedback.entity.TSFeedreplyEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSFeedreplyServiceI extends CommonService{
	
 	public void delete(TSFeedreplyEntity entity) throws Exception;
 	
 	public Serializable save(TSFeedreplyEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSFeedreplyEntity entity) throws Exception;
 	
}
