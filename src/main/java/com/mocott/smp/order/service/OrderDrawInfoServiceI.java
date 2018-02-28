package com.mocott.smp.order.service;
import com.mocott.smp.order.entity.OrderDrawInfoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface OrderDrawInfoServiceI extends CommonService{
	
 	public void delete(OrderDrawInfoEntity entity) throws Exception;
 	
 	public Serializable save(OrderDrawInfoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(OrderDrawInfoEntity entity) throws Exception;

	public void updateByUserName(String userName) throws Exception;
}
