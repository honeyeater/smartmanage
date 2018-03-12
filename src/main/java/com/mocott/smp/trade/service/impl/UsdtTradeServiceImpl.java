package com.mocott.smp.trade.service.impl;

import com.mocott.smp.trade.entity.UsdtTradeEntity;
import com.mocott.smp.trade.entity.UserUsdtInfoEntity;
import com.mocott.smp.trade.model.UsdtTradeInfo;
import com.mocott.smp.trade.service.UsdtTradeServiceI;
import com.mocott.smp.trade.service.UserUsdtInfoServiceI;
import org.hibernate.Query;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.*;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.io.Serializable;

import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("usdtTradeService")
@Transactional
public class UsdtTradeServiceImpl extends CommonServiceImpl implements UsdtTradeServiceI {

	@Autowired
    private UserUsdtInfoServiceI userUsdtInfoService;

 	public void delete(UsdtTradeEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(UsdtTradeEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(UsdtTradeEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}

    /**
     * 保存买入信息
     * @param usdtTradeInfo
     * @throws Exception
     */
    public void saveBuy(UsdtTradeInfo usdtTradeInfo) throws Exception {
    }

    /**
     * 买入信息审核
     * @throws Exception
     */
    public void buyAudit(UsdtTradeEntity usdtTradeEntity, String auditFlag) throws Exception {
        Date now = new Date();
        if("1".equals(auditFlag)) { // 审核通过
            usdtTradeEntity.setStatus("1");
        }
        if("0".equals(auditFlag)) { // 审核不通过
            usdtTradeEntity.setStatus("-1");
        }
        usdtTradeEntity.setOperatetimeforhis(now);
        TSUser tsUser = ResourceUtil.getSessionUser();
        if(tsUser != null) {
            usdtTradeEntity.setVfield1(tsUser.getUserName());
        } else {
            usdtTradeEntity.setVfield1("当前用户");
        }
        this.saveOrUpdate(usdtTradeEntity);

        // 审核通过
        if("1".equals(usdtTradeEntity.getStatus())) {
            UserUsdtInfoEntity userUsdtInfoEntity = userUsdtInfoService.queryUserUsdtByUserName(usdtTradeEntity.getUsername());
            if(userUsdtInfoEntity != null) {
                double num = userUsdtInfoEntity.getNum();
                num = num + usdtTradeEntity.getNum();
                userUsdtInfoEntity.setNum(num);
                userUsdtInfoEntity.setOperatetimeforhis(now);
                userUsdtInfoService.saveOrUpdate(userUsdtInfoEntity);
            } else {
				userUsdtInfoEntity = new UserUsdtInfoEntity();
				userUsdtInfoEntity.setUsername(usdtTradeEntity.getUsername());
				userUsdtInfoEntity.setNum(usdtTradeEntity.getNum());
				userUsdtInfoEntity.setInserttimeforhis(now);
				userUsdtInfoEntity.setInputtime(now);
				userUsdtInfoEntity.setOperatetimeforhis(now);
				userUsdtInfoService.save(userUsdtInfoEntity);
			}
        }
    }

    /**
     * 卖出信息审核
     * @throws Exception
     */
    public void saleAudit(UsdtTradeEntity usdtTradeEntity, String auditFlag) throws Exception {
        Date now = new Date();
        if("1".equals(auditFlag)) { // 审核通过
            usdtTradeEntity.setStatus("1");
        }
        if("0".equals(auditFlag)) { // 审核不通过
            usdtTradeEntity.setStatus("-1");
        }
        usdtTradeEntity.setOperatetimeforhis(now);
        TSUser tsUser = ResourceUtil.getSessionUser();
        if(tsUser != null) {
            usdtTradeEntity.setVfield1(tsUser.getUserName());
        } else {
            usdtTradeEntity.setVfield1("当前用户");
        }
        this.saveOrUpdate(usdtTradeEntity);

        // 审核通过
        if("1".equals(usdtTradeEntity.getStatus())) {
            UserUsdtInfoEntity userUsdtInfoEntity = userUsdtInfoService.queryUserUsdtByUserName(usdtTradeEntity.getUsername());
//            if(userUsdtInfoEntity != null) {
//                double num = userUsdtInfoEntity.getNum();
//                num = num - usdtTradeEntity.getNum();
//                userUsdtInfoEntity.setNum(num);
//                userUsdtInfoEntity.setOperatetimeforhis(now);
//                userUsdtInfoService.saveOrUpdate(userUsdtInfoEntity);
//            }
        }
    }
    /**
     * 保存卖出信息
     * @param usdtTradeInfo
     * @throws Exception
     */
    public void saveSale(UsdtTradeInfo usdtTradeInfo) throws Exception {
    }

    /**
     * 根据用户名获取交易信息
     * @param username
     * @return
     */
    public List<UsdtTradeEntity> getUsdtListByUserName(String username) {
        String query = " from UsdtTradeEntity u where u.username =:username";
        Query queryObject = getSession().createQuery(query);
        queryObject.setParameter("username", username);
        List<UsdtTradeEntity> usdtLists = queryObject.list();
        return  usdtLists;
    }

    /**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(UsdtTradeEntity t) throws Exception{
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
	private void doUpdateBus(UsdtTradeEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @return
	 */
	private void doDelBus(UsdtTradeEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(UsdtTradeEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("username", t.getUsername());
		map.put("trade_no", t.getTradeNo());
		map.put("currency_type", t.getCurrencyType());
		map.put("price", t.getPrice());
		map.put("num", t.getNum());
		map.put("money", t.getMoney());
		map.put("fee_rate", t.getFeeRate());
		map.put("fee", t.getFee());
		map.put("trade_type", t.getTradeType());
		map.put("status", t.getStatus());
		map.put("draw_url", t.getDrawUrl());
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
 	public String replaceVal(String sql,UsdtTradeEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{username}",String.valueOf(t.getUsername()));
 		sql  = sql.replace("#{trade_no}",String.valueOf(t.getTradeNo()));
 		sql  = sql.replace("#{currency_type}",String.valueOf(t.getCurrencyType()));
 		sql  = sql.replace("#{price}",String.valueOf(t.getPrice()));
 		sql  = sql.replace("#{num}",String.valueOf(t.getNum()));
 		sql  = sql.replace("#{money}",String.valueOf(t.getMoney()));
 		sql  = sql.replace("#{fee_rate}",String.valueOf(t.getFeeRate()));
 		sql  = sql.replace("#{fee}",String.valueOf(t.getFee()));
 		sql  = sql.replace("#{trade_type}",String.valueOf(t.getTradeType()));
 		sql  = sql.replace("#{status}",String.valueOf(t.getStatus()));
 		sql  = sql.replace("#{draw_url}",String.valueOf(t.getDrawUrl()));
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
					javaInter.execute("usdt_trade",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}