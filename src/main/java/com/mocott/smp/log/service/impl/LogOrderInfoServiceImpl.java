package com.mocott.smp.log.service.impl;

import com.mocott.smp.log.entity.LogOrderInfoEntity;
import com.mocott.smp.log.service.LogOrderInfoServiceI;
import org.hibernate.Query;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("logOrderInfoService")
@Transactional
public class LogOrderInfoServiceImpl extends CommonServiceImpl implements LogOrderInfoServiceI {

	
 	public void delete(LogOrderInfoEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(LogOrderInfoEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(LogOrderInfoEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}

	/**
	 * 倒序获取用户的订单信息
	 * @param userName
	 * @return
	 * @throws Exception
     */
	public List<LogOrderInfoEntity> getOrderListDesc(String userName) throws Exception {
		String query = " from LogOrderInfoEntity l where l.username =:userName order by orderTime desc";
		Query queryObject = getSession().createQuery(query);
		queryObject.setParameter("userName", userName);
		return  queryObject.list();
	}


	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(LogOrderInfoEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(LogOrderInfoEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(LogOrderInfoEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(LogOrderInfoEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("username", t.getUsername());
		map.put("serialno", t.getSerialno());
		map.put("order_code", t.getOrderCode());
		map.put("order_money", t.getOrderMoney());
		map.put("dyn_money", t.getDynMoney());
		map.put("other_money", t.getOtherMoney());
		map.put("back_money", t.getBackMoney());
		map.put("release_money", t.getReleaseMoney());
		map.put("order_time", t.getOrderTime());
		map.put("order_type", t.getOrderType());
		map.put("remark", t.getRemark());
		map.put("reason", t.getReason());
		map.put("inputtime", t.getInputtime());
		map.put("inserttimeforhis", t.getInserttimeforhis());
		map.put("operatetimeforhis", t.getOperatetimeforhis());
		map.put("vfield1", t.getVfield1());
		map.put("vfield2", t.getVfield2());
		map.put("vfield3", t.getVfield3());
		map.put("vfield4", t.getVfield4());
		map.put("vfield5", t.getVfield5());
		map.put("vfield6", t.getVfield6());
		map.put("nfield1", t.getNfield1());
		map.put("nfield2", t.getNfield2());
		map.put("nfield3", t.getNfield3());
		map.put("nfield4", t.getNfield4());
		map.put("dfield1", t.getDfield1());
		map.put("dfield2", t.getDfield2());
		map.put("dfield3", t.getDfield3());
		map.put("dfield4", t.getDfield4());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,LogOrderInfoEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{username}",String.valueOf(t.getUsername()));
 		sql  = sql.replace("#{serialno}",String.valueOf(t.getSerialno()));
 		sql  = sql.replace("#{order_code}",String.valueOf(t.getOrderCode()));
 		sql  = sql.replace("#{order_money}",String.valueOf(t.getOrderMoney()));
 		sql  = sql.replace("#{dyn_money}",String.valueOf(t.getDynMoney()));
 		sql  = sql.replace("#{other_money}",String.valueOf(t.getOtherMoney()));
 		sql  = sql.replace("#{back_money}",String.valueOf(t.getBackMoney()));
 		sql  = sql.replace("#{release_money}",String.valueOf(t.getReleaseMoney()));
 		sql  = sql.replace("#{order_time}",String.valueOf(t.getOrderTime()));
 		sql  = sql.replace("#{order_type}",String.valueOf(t.getOrderType()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{reason}",String.valueOf(t.getReason()));
 		sql  = sql.replace("#{inputtime}",String.valueOf(t.getInputtime()));
 		sql  = sql.replace("#{inserttimeforhis}",String.valueOf(t.getInserttimeforhis()));
 		sql  = sql.replace("#{operatetimeforhis}",String.valueOf(t.getOperatetimeforhis()));
 		sql  = sql.replace("#{vfield1}",String.valueOf(t.getVfield1()));
 		sql  = sql.replace("#{vfield2}",String.valueOf(t.getVfield2()));
 		sql  = sql.replace("#{vfield3}",String.valueOf(t.getVfield3()));
 		sql  = sql.replace("#{vfield4}",String.valueOf(t.getVfield4()));
 		sql  = sql.replace("#{vfield5}",String.valueOf(t.getVfield5()));
 		sql  = sql.replace("#{vfield6}",String.valueOf(t.getVfield6()));
 		sql  = sql.replace("#{nfield1}",String.valueOf(t.getNfield1()));
 		sql  = sql.replace("#{nfield2}",String.valueOf(t.getNfield2()));
 		sql  = sql.replace("#{nfield3}",String.valueOf(t.getNfield3()));
 		sql  = sql.replace("#{nfield4}",String.valueOf(t.getNfield4()));
 		sql  = sql.replace("#{dfield1}",String.valueOf(t.getDfield1()));
 		sql  = sql.replace("#{dfield2}",String.valueOf(t.getDfield2()));
 		sql  = sql.replace("#{dfield3}",String.valueOf(t.getDfield3()));
 		sql  = sql.replace("#{dfield4}",String.valueOf(t.getDfield4()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("log_order_info",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}