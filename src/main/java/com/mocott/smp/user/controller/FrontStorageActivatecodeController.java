package com.mocott.smp.user.controller;

import com.mocott.smp.user.entity.FrontStorageActivatecodeEntity;
import com.mocott.smp.user.service.FrontStorageActivatecodeServiceI;
import org.apache.log4j.Logger;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.*;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.net.URI;
import java.util.*;

/**   
 * @Title: Controller  
 * @Description: 激活码信息
 * @author onlineGenerator
 * @date 2018-03-11 22:34:39
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/frontStorageActivatecodeController")
public class FrontStorageActivatecodeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(FrontStorageActivatecodeController.class);

	@Autowired
	private FrontStorageActivatecodeServiceI frontStorageActivatecodeService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 激活码信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("smp/activate/frontStorageActivatecodeList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(FrontStorageActivatecodeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, frontStorageActivatecode, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.frontStorageActivatecodeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除激活码信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		frontStorageActivatecode = systemService.getEntity(FrontStorageActivatecodeEntity.class, frontStorageActivatecode.getId());
		message = "激活码信息删除成功";
		try{
			frontStorageActivatecodeService.delete(frontStorageActivatecode);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "激活码信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除激活码信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "激活码信息删除成功";
		try{
			for(String id:ids.split(",")){
				FrontStorageActivatecodeEntity frontStorageActivatecode = systemService.getEntity(FrontStorageActivatecodeEntity.class, 
				id
				);
				frontStorageActivatecodeService.delete(frontStorageActivatecode);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "激活码信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加激活码信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "激活码信息添加成功";
		try{
			frontStorageActivatecodeService.save(frontStorageActivatecode);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "激活码信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

    /**
     * 批量添加激活码信息
     *
     * @return
     */
    @RequestMapping(params = "doBatchGenerate")
    @ResponseBody
    public AjaxJson doBatchGenerate(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest request) {
        String message = null;
        AjaxJson j = new AjaxJson();
        message = "激活码批量生成成功";
        try{
            String num = frontStorageActivatecode.getActivieCode();
            String activietype = frontStorageActivatecode.getActivieType();
            String date = DateUtils.getDate("yyyy-MM-dd HH:mm:ss");
            Date now = new Date();
            List<FrontStorageActivatecodeEntity> codes = new ArrayList<FrontStorageActivatecodeEntity>();
            if(StringUtil.isNotEmpty(num) && Integer.parseInt(num)>0) {
                for (int i=0; i<Integer.parseInt(num); i++) {
                    FrontStorageActivatecodeEntity frontStorageActivate = new FrontStorageActivatecodeEntity();
                    frontStorageActivate.setActivieCode(PasswordUtil.encrypt(Math.rint(100)*100+"", UUID.randomUUID().toString(), PasswordUtil.getStaticSalt()));
                    frontStorageActivate.setActivieType(activietype);
                    frontStorageActivate.setGenerateTime(date);
                    frontStorageActivate.setInputtime(now);
                    frontStorageActivate.setInserttimeforhis(now);
                    frontStorageActivate.setOperatetimeforhis(now);
                    frontStorageActivate.setIsuse("0");
                    frontStorageActivate.setValidstatus("1");
                    codes.add(frontStorageActivate);
                }
                frontStorageActivatecodeService.batchSave(codes);
            }
            systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
        }catch(Exception e){
            e.printStackTrace();
            message = "激活码批量生成失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

	
	/**
	 * 更新激活码信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "激活码信息更新成功";
		FrontStorageActivatecodeEntity t = frontStorageActivatecodeService.get(FrontStorageActivatecodeEntity.class, frontStorageActivatecode.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(frontStorageActivatecode, t);
			frontStorageActivatecodeService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "激活码信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 激活码信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(frontStorageActivatecode.getId())) {
			frontStorageActivatecode = frontStorageActivatecodeService.getEntity(FrontStorageActivatecodeEntity.class, frontStorageActivatecode.getId());
			req.setAttribute("frontStorageActivatecodePage", frontStorageActivatecode);
		}
		return new ModelAndView("smp/activate/frontStorageActivatecode-add");
	}

    /**
     * 激活码信息新增页面跳转
     *
     * @return
     */
    @RequestMapping(params = "goBatchGenerate")
    public ModelAndView goBatchGenerate(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest req) {
        if (StringUtil.isNotEmpty(frontStorageActivatecode.getId())) {
            frontStorageActivatecode = frontStorageActivatecodeService.getEntity(FrontStorageActivatecodeEntity.class, frontStorageActivatecode.getId());
            req.setAttribute("frontStorageActivatecodePage", frontStorageActivatecode);
        }
        return new ModelAndView("smp/activate/frontStorageActivatecode-addbatch");
    }
	/**
	 * 激活码信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(FrontStorageActivatecodeEntity frontStorageActivatecode, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(frontStorageActivatecode.getId())) {
			frontStorageActivatecode = frontStorageActivatecodeService.getEntity(FrontStorageActivatecodeEntity.class, frontStorageActivatecode.getId());
			req.setAttribute("frontStorageActivatecodePage", frontStorageActivatecode);
		}
		return new ModelAndView("smp/activate/frontStorageActivatecode-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","frontStorageActivatecodeController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(FrontStorageActivatecodeEntity frontStorageActivatecode,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(FrontStorageActivatecodeEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, frontStorageActivatecode, request.getParameterMap());
		List<FrontStorageActivatecodeEntity> frontStorageActivatecodes = this.frontStorageActivatecodeService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"激活码信息");
		modelMap.put(NormalExcelConstants.CLASS,FrontStorageActivatecodeEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("激活码信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,frontStorageActivatecodes);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(FrontStorageActivatecodeEntity frontStorageActivatecode,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"激活码信息");
    	modelMap.put(NormalExcelConstants.CLASS,FrontStorageActivatecodeEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("激活码信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<FrontStorageActivatecodeEntity> listFrontStorageActivatecodeEntitys = ExcelImportUtil.importExcel(file.getInputStream(),FrontStorageActivatecodeEntity.class,params);
				for (FrontStorageActivatecodeEntity frontStorageActivatecode : listFrontStorageActivatecodeEntitys) {
					frontStorageActivatecodeService.save(frontStorageActivatecode);
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
	public List<FrontStorageActivatecodeEntity> list() {
		List<FrontStorageActivatecodeEntity> listFrontStorageActivatecodes=frontStorageActivatecodeService.getList(FrontStorageActivatecodeEntity.class);
		return listFrontStorageActivatecodes;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		FrontStorageActivatecodeEntity task = frontStorageActivatecodeService.get(FrontStorageActivatecodeEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody FrontStorageActivatecodeEntity frontStorageActivatecode, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<FrontStorageActivatecodeEntity>> failures = validator.validate(frontStorageActivatecode);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			frontStorageActivatecodeService.save(frontStorageActivatecode);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = frontStorageActivatecode.getId();
		URI uri = uriBuilder.path("/rest/frontStorageActivatecodeController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody FrontStorageActivatecodeEntity frontStorageActivatecode) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<FrontStorageActivatecodeEntity>> failures = validator.validate(frontStorageActivatecode);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			frontStorageActivatecodeService.saveOrUpdate(frontStorageActivatecode);
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
		frontStorageActivatecodeService.deleteEntityById(FrontStorageActivatecodeEntity.class, id);
	}
}
