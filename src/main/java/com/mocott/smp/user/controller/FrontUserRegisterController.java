package com.mocott.smp.user.controller;
import com.mocott.smp.base.service.TSConfigcodeServiceI;
import com.mocott.smp.order.service.OrderInjectInfoServiceI;
import com.mocott.smp.user.entity.FrontUserMemberEntity;
import com.mocott.smp.user.entity.FrontUserRegisterEntity;
import com.mocott.smp.user.service.FrontUserMemberServiceI;
import com.mocott.smp.user.service.FrontUserRegisterServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mocott.smp.util.OrderConstant;
import org.apache.log4j.Logger;
import org.jeecgframework.core.util.*;
import org.jeecgframework.tag.vo.datatable.SortDirection;
import org.jeecgframework.web.system.pojo.base.TSType;
import org.jeecgframework.web.system.pojo.base.TSTypegroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;

import java.io.OutputStream;

import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller  
 * @Description: 注册用户信息表
 * @author onlineGenerator
 * @date 2018-01-23 11:02:16
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/frontUserRegisterController")
public class FrontUserRegisterController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(FrontUserRegisterController.class);

	@Autowired
	private FrontUserRegisterServiceI frontUserRegisterService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	@Autowired
    private TSConfigcodeServiceI tsConfigcodeServiceI;
	@Autowired
    private FrontUserMemberServiceI frontUserMemberService;
	@Autowired
    private OrderInjectInfoServiceI orderInjectInfoService;


    /**
     * 用户注册页面跳转
     *
     * @return
     */
    @RequestMapping(params = "register")
    public ModelAndView register(HttpServletRequest request) {
        return new ModelAndView("/smp/user/frontUserRegister");
    }

	/**
	 * 注册用户信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("smp/user/frontUserRegisterList");
	}

    /**
     * 注册用户信息重置 页面跳转
     *
     * @return
     */
    @RequestMapping(params = "userReset")
    public ModelAndView userReset(HttpServletRequest request) {
        return new ModelAndView("smp/user/frontUserList");
    }

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(FrontUserRegisterEntity frontUserRegister,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(FrontUserRegisterEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, frontUserRegister, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.frontUserRegisterService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除注册用户信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(FrontUserRegisterEntity frontUserRegister, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		frontUserRegister = systemService.getEntity(FrontUserRegisterEntity.class, frontUserRegister.getId());
		message = "注册用户信息表删除成功";
		try{
			frontUserRegisterService.delete(frontUserRegister);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "注册用户信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除注册用户信息表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "注册用户信息表删除成功";
		try{
			for(String id:ids.split(",")){
				FrontUserRegisterEntity frontUserRegister = systemService.getEntity(FrontUserRegisterEntity.class, 
				id
				);
				frontUserRegisterService.delete(frontUserRegister);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "注册用户信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加注册用户信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(FrontUserRegisterEntity frontUserRegister, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "注册用户信息表添加成功";
		try{
			frontUserRegisterService.save(frontUserRegister);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "注册用户信息表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新注册用户信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(FrontUserRegisterEntity frontUserRegister, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "注册用户信息表更新成功";
		FrontUserRegisterEntity t = frontUserRegisterService.get(FrontUserRegisterEntity.class, frontUserRegister.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(frontUserRegister, t);
			frontUserRegisterService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "注册用户信息表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 注册用户信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(FrontUserRegisterEntity frontUserRegister, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(frontUserRegister.getId())) {
			frontUserRegister = frontUserRegisterService.getEntity(FrontUserRegisterEntity.class, frontUserRegister.getId());
			req.setAttribute("frontUserRegisterPage", frontUserRegister);
		}
		return new ModelAndView("/user/frontUserRegister-add");
	}
	/**
	 * 注册用户信息表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(FrontUserRegisterEntity frontUserRegister, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(frontUserRegister.getId())) {
			frontUserRegister = frontUserRegisterService.getEntity(FrontUserRegisterEntity.class, frontUserRegister.getId());
			req.setAttribute("frontUserRegisterPage", frontUserRegister);
		}
		return new ModelAndView("smp/user/frontUserRegister-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","frontUserRegisterController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(FrontUserRegisterEntity frontUserRegister,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(FrontUserRegisterEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, frontUserRegister, request.getParameterMap());
		List<FrontUserRegisterEntity> frontUserRegisters = this.frontUserRegisterService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"注册用户信息表");
		modelMap.put(NormalExcelConstants.CLASS,FrontUserRegisterEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("注册用户信息表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,frontUserRegisters);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(FrontUserRegisterEntity frontUserRegister,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"注册用户信息表");
    	modelMap.put(NormalExcelConstants.CLASS,FrontUserRegisterEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("注册用户信息表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<FrontUserRegisterEntity> listFrontUserRegisterEntitys = ExcelImportUtil.importExcel(file.getInputStream(),FrontUserRegisterEntity.class,params);
				for (FrontUserRegisterEntity frontUserRegister : listFrontUserRegisterEntitys) {
					frontUserRegisterService.save(frontUserRegister);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<FrontUserRegisterEntity> list() {
		List<FrontUserRegisterEntity> listFrontUserRegisters=frontUserRegisterService.getList(FrontUserRegisterEntity.class);
		return listFrontUserRegisters;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		FrontUserRegisterEntity task = frontUserRegisterService.get(FrontUserRegisterEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody FrontUserRegisterEntity frontUserRegister, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<FrontUserRegisterEntity>> failures = validator.validate(frontUserRegister);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			frontUserRegisterService.save(frontUserRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = frontUserRegister.getId();
		URI uri = uriBuilder.path("/rest/frontUserRegisterController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody FrontUserRegisterEntity frontUserRegister) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<FrontUserRegisterEntity>> failures = validator.validate(frontUserRegister);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			frontUserRegisterService.saveOrUpdate(frontUserRegister);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		frontUserRegisterService.deleteEntityById(FrontUserRegisterEntity.class, id);
	}

    @RequestMapping(params = "goUserViews")
    public ModelAndView goUserViews(HttpServletRequest request) {
        String typegroupcode = request.getParameter("typegroupcode");
        String userName = request.getParameter("username");
        request.setAttribute("typegroupcode", typegroupcode);
        request.setAttribute("userName", userName);
        return new ModelAndView("smp/user/frontUserListForViews");
    }
    @RequestMapping(params = "typeGrid")

    public void typeGrid(HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
	    String typegroupcode = request.getParameter("typegroupcode");
        List< TSTypegroup > typegroups=systemService.findByProperty(TSTypegroup.class,"typegroupcode",typegroupcode);
        String typegroupid = "";
        if(typegroups != null && typegroups.size()>0) {
            typegroupid = typegroups.get(0).getId();
        }

        CriteriaQuery cq = new CriteriaQuery(TSType.class, dataGrid);
        cq.eq("TSTypegroup.id", typegroupid);
        cq.addOrder("createDate", SortDirection.desc);
        cq.add();
        this.systemService.getDataGridReturn(cq, true);

        MutiLangUtil.setMutiLangValueForList(dataGrid.getResults(), "typename");


        TagUtil.datagrid(response, dataGrid);
    }

    /**
     * 重置用户信息表
     * copyOnline
     */
    @RequestMapping(params = "resetUserView")
    @ResponseBody
    public AjaxJson resetUserView(String typecode, String userName, HttpServletRequest request, HttpServletResponse response) {
        AjaxJson j = new AjaxJson();
        String message = "信息重置成功";
        try {
            if(StringUtil.isNotEmpty(typecode) && StringUtil.isNotEmpty(userName)){
                if ("front_user_register".equals(typecode)) {  // 用户注册信息
                    List<FrontUserRegisterEntity> frontUserRegisterList = frontUserRegisterService.findByProperty(FrontUserRegisterEntity.class, "userName", userName);
                    if(frontUserRegisterList != null && frontUserRegisterList.size()>0) {
                        FrontUserRegisterEntity frontUserRegisterEntity = frontUserRegisterList.get(0);
                        frontUserRegisterEntity.setValidFlag("1");
                        frontUserRegisterEntity.setUserLevel("1");
                        frontUserRegisterService.saveOrUpdate(frontUserRegisterEntity);
                    }
                }
                if ("front_user_member".equals(typecode)) {  //会员信息
                    List<FrontUserMemberEntity> userMemberList = frontUserMemberService.findByProperty(FrontUserMemberEntity.class, "username", userName);
                    if(userMemberList != null && userMemberList.size()>0) {
                        FrontUserMemberEntity frontUserMember = userMemberList.get(0);
                        frontUserMember.setUserLevel("1");
                        frontUserMember.setSumAmount(0.00);
                        frontUserMember.setIntroNums("0");
                        frontUserMember.setTeamNums("0");
                        frontUserMember.setCouponWallet(0.00);
                        frontUserMember.setIntroWallet(0.00);
                        frontUserMember.setSumAmount(
                                tsConfigcodeServiceI.getConfigValue(OrderConstant.Sys_Base_Limit) != null?
                        Double.parseDouble(tsConfigcodeServiceI.getConfigValue(OrderConstant.Sys_Base_Limit).getConfigValue()) : 1000000.00
                        );
                        frontUserMember.setUseLimit(0.00);
                        frontUserMember.setVfield1("");
                        frontUserMemberService.saveOrUpdate(frontUserMember);
                    }
                }
                if ("order_ inject_info".equals(typecode)) {  //注入资金订单
                    orderInjectInfoService.updateByUserName(userName);
                }
                if ("order_ draw_info".equals(typecode)) {  //提出资金订单

                }
                if ("log_trade_info".equals(typecode)) {  //交易日志信息

                }
                if ("t_s_feedback".equals(typecode)) {  //意见反馈

                }
                if ("t_s_feedreply".equals(typecode)) {  //意见回复信息

                }
                if ("t_s_feedreply".equals(typecode)) {  //意见回复信息

                }
                if ("t_s_feedreply".equals(typecode)) {  //附件信息

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            message = "信息重置失败";
            j.setSuccess(false);
            j.setMsg(message);
            throw new BusinessException(e.getMessage());
        }

        return j;
    }



}
