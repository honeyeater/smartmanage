package com.mocott.smp.user.service.impl;
import com.mocott.smp.user.service.FrontUserRegisterServiceI;
import org.hibernate.Query;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.mocott.smp.user.entity.FrontUserRegisterEntity;
import org.jeecgframework.core.util.PasswordUtil;
import org.jeecgframework.web.system.pojo.base.TSUser;
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

@Service("frontUserRegisterService")
@Transactional
public class FrontUserRegisterServiceImpl extends CommonServiceImpl implements FrontUserRegisterServiceI {

	
 	public void delete(FrontUserRegisterEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(FrontUserRegisterEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(FrontUserRegisterEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}

    /**
     * 登录校验用户是否存在
     * @param user
     * @return
     */
    @Override
    public FrontUserRegisterEntity checkUserExits(FrontUserRegisterEntity user) {
        String password = PasswordUtil.encrypt(user.getUserName(), user.getPassword(), PasswordUtil.getStaticSalt());
        String query = "from FrontUserRegisterEntity u where u.userName = :username and u.password=:passowrd";
        Query queryObject = getSession().createQuery(query);
        queryObject.setParameter("username", user.getUserName());
        queryObject.setParameter("passowrd", password);
        List<FrontUserRegisterEntity> users = queryObject.list();

        if (users != null && users.size() > 0) {
            return users.get(0);
        } else {
            queryObject = getSession().createQuery(query);
            queryObject.setParameter("username", user.getUserName());
            queryObject.setParameter("passowrd", user.getPassword());
            users = queryObject.list();
            if(users != null && users.size() > 0){
                return users.get(0);
            }
        }
        return null;
    }

    /**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(FrontUserRegisterEntity t) throws Exception{
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
	private void doUpdateBus(FrontUserRegisterEntity t) throws Exception{
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
	private void doDelBus(FrontUserRegisterEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(FrontUserRegisterEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("username", t.getUserName());
		map.put("phoneno", t.getPhoneno());
		map.put("identity_no", t.getIdentityNo());
		map.put("realname", t.getRealname());
		map.put("province", t.getProvince());
		map.put("city", t.getCity());
		map.put("bank_code", t.getBankCode());
		map.put("bank_name", t.getBankName());
		map.put("bank_card", t.getBankCard());
		map.put("bank_address", t.getBankAddress());
		map.put("password", t.getPassword());
		map.put("safe_password", t.getSafePassword());
		map.put("register_time", t.getRegisterTime());
		map.put("register_ip", t.getRegisterIp());
		map.put("linker_mobile", t.getLinkerMobile());
		map.put("address", t.getAddress());
		map.put("valid_flag", t.getValidFlag());
		map.put("active_time", t.getActiveTime());
		map.put("user_level", t.getUserLevel());
		map.put("introducer", t.getIntroducer());
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
 	public String replaceVal(String sql,FrontUserRegisterEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{username}",String.valueOf(t.getUserName()));
 		sql  = sql.replace("#{phoneno}",String.valueOf(t.getPhoneno()));
 		sql  = sql.replace("#{identity_no}",String.valueOf(t.getIdentityNo()));
 		sql  = sql.replace("#{realname}",String.valueOf(t.getRealname()));
 		sql  = sql.replace("#{province}",String.valueOf(t.getProvince()));
 		sql  = sql.replace("#{city}",String.valueOf(t.getCity()));
 		sql  = sql.replace("#{bank_code}",String.valueOf(t.getBankCode()));
 		sql  = sql.replace("#{bank_name}",String.valueOf(t.getBankName()));
 		sql  = sql.replace("#{bank_card}",String.valueOf(t.getBankCard()));
 		sql  = sql.replace("#{bank_address}",String.valueOf(t.getBankAddress()));
 		sql  = sql.replace("#{password}",String.valueOf(t.getPassword()));
 		sql  = sql.replace("#{safe_password}",String.valueOf(t.getSafePassword()));
 		sql  = sql.replace("#{register_time}",String.valueOf(t.getRegisterTime()));
 		sql  = sql.replace("#{register_ip}",String.valueOf(t.getRegisterIp()));
 		sql  = sql.replace("#{linker_mobile}",String.valueOf(t.getLinkerMobile()));
 		sql  = sql.replace("#{address}",String.valueOf(t.getAddress()));
 		sql  = sql.replace("#{valid_flag}",String.valueOf(t.getValidFlag()));
 		sql  = sql.replace("#{active_time}",String.valueOf(t.getActiveTime()));
 		sql  = sql.replace("#{user_level}",String.valueOf(t.getUserLevel()));
 		sql  = sql.replace("#{introducer}",String.valueOf(t.getIntroducer()));
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
					javaInter.execute("front_user_register",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}