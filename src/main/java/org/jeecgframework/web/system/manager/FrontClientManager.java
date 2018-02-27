package org.jeecgframework.web.system.manager;

import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.core.util.ContextHolderUtils;
import org.jeecgframework.core.util.EhcacheUtil;
import org.jeecgframework.web.system.pojo.base.FrontClient;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * 对前端在线用户的管理
 * @author JueYue
 * @date 2013-9-28
 * @version 1.0
 */

public class FrontClientManager {
	private final String CACHENAME ="eternalCache";
	private final String OnlineClientsKey ="onLineClients";

	private static FrontClientManager instance = new FrontClientManager();

	private FrontClientManager(){
		
	}
	
	public static FrontClientManager getInstance(){
		return instance;
	}
	
	/**
	 * 向ehcache缓存中增加Client对象
	 * @author xugj
	 * */
	@SuppressWarnings("unchecked")
	private boolean addClientToCachedMap(String sessionId,FrontClient client ){
		HashMap<String, FrontClient> onLineClients ;
		if(EhcacheUtil.get(CACHENAME, OnlineClientsKey)==null){
			onLineClients = new HashMap<String, FrontClient>();
		}
		else{
			onLineClients =(HashMap<String, FrontClient>) EhcacheUtil.get(CACHENAME,OnlineClientsKey);
		}
		onLineClients.put(sessionId, client);
		EhcacheUtil.put(CACHENAME,OnlineClientsKey, onLineClients);
		return true;
	}
	
	/**
	 * 从缓存中的Client集合中删除 Client对象
	 * */
	@SuppressWarnings("unchecked")
	private boolean removeClientFromCachedMap(String sessionId){
		HashMap<String, FrontClient> onLineClients ;
		if(EhcacheUtil.get(CACHENAME, OnlineClientsKey)!=null){
			onLineClients =(HashMap<String, FrontClient>) EhcacheUtil.get(CACHENAME,OnlineClientsKey);
			onLineClients.remove(sessionId);
			EhcacheUtil.put(CACHENAME, OnlineClientsKey, onLineClients);
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * 用户登录，向session中增加用户信息
	 * @param sessionId
	 * @param client
	 */
	public void addClinet(String sessionId,FrontClient client){
		ContextHolderUtils.getSession().setAttribute(sessionId, client);
		if(client !=null){
            FrontClient ret = new FrontClient();
			ret.setIp(client.getIp());
			ret.setLogindatetime(client.getLogindatetime());
			ret.setUser(client.getUser());
			addClientToCachedMap(sessionId,ret);
		}
	}
	/**
	 * 用户退出登录 从Session中删除用户信息
	 * sessionId
	 */
	public void removeClinet(String sessionId){
		try {
			ContextHolderUtils.removeSession(sessionId);
		} catch (Exception e) {}
		try {
			HttpSession session = ContextHolderUtils.getSession();
			session.removeAttribute(sessionId);
		} catch (Exception e) {}
		removeClientFromCachedMap(sessionId);
	}
	/**
	 * 根据sessionId 得到Client 对象
	 * @param sessionId
	 */
	public FrontClient getClient(String sessionId){
		if(!StringUtils.isEmpty(sessionId)&&ContextHolderUtils.getSession().getAttribute(sessionId)!=null){
			return (FrontClient)ContextHolderUtils.getSession().getAttribute(sessionId);
		}
		else{
			return null;
		}
	}
	/**
	 * 得到Client 对象
	 */
	public FrontClient getClient(){
		String sessionId = ContextHolderUtils.getSession().getId();
		if(!StringUtils.isEmpty(sessionId)&&ContextHolderUtils.getSession().getAttribute(sessionId)!=null){
			return (FrontClient)ContextHolderUtils.getSession().getAttribute(sessionId);
		}
		else{
			return null;
		}
	}
	/**
	 * 得到所有在线用户
	 */
	@SuppressWarnings("unchecked")
	public Collection<FrontClient> getAllClient(){
		if(EhcacheUtil.get(CACHENAME,OnlineClientsKey)!=null){
			HashMap<String, FrontClient> onLineClients = (HashMap<String, FrontClient>) EhcacheUtil.get(CACHENAME,OnlineClientsKey);
			return onLineClients.values();
		}
		else
			return new ArrayList<FrontClient>();
	}
}

