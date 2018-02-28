package com.mocott.smp.feedback.service;
import com.mocott.smp.feedback.entity.TSFeedbackEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TSFeedbackServiceI extends CommonService{
	
 	public void delete(TSFeedbackEntity entity) throws Exception;
 	
 	public Serializable save(TSFeedbackEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TSFeedbackEntity entity) throws Exception;

	public void updateByUserName(String userName) throws Exception;
}
