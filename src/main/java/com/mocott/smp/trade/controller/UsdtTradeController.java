package com.mocott.smp.trade.controller;

import com.mocott.smp.base.entity.TSConfigcodeEntity;
import com.mocott.smp.base.service.TSConfigcodeServiceI;
import com.mocott.smp.trade.entity.UsdtPriceEntity;
import com.mocott.smp.trade.entity.UsdtTradeEntity;
import com.mocott.smp.trade.entity.UserUsdtInfoEntity;
import com.mocott.smp.trade.model.UsdtTradeInfo;
import com.mocott.smp.trade.service.UsdtPriceServiceI;
import com.mocott.smp.trade.service.UsdtTradeServiceI;
import com.mocott.smp.trade.service.UserUsdtInfoServiceI;
import com.mocott.smp.trade.service.impl.UsdtPriceServiceImpl;
import com.mocott.smp.user.entity.FrontUserRegisterEntity;
import com.mocott.smp.user.service.FrontUserRegisterServiceI;
import com.mocott.smp.util.OrderConstant;
import org.apache.log4j.Logger;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.hibernate.qbc.PageList;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**   
 * @Title: Controller  
 * @Description: USDT交易信息
 * @author onlineGenerator
 * @date 2018-03-08 00:52:14
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/usdtTradeController")
public class UsdtTradeController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UsdtTradeController.class);

	@Autowired
	private UsdtTradeServiceI usdtTradeService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
    @Autowired
    private FrontUserRegisterServiceI frontUserRegisterService;
	@Autowired
	private UsdtPriceServiceI usdtPriceService;
	@Autowired
	private UserUsdtInfoServiceI userUsdtInfoService;
	@Autowired
	private TSConfigcodeServiceI tsConfigcodeService;

	/**
	 * USDT交易 页面跳转
	 *
	 * @return
	 */
	@RequestMapping(params = "toTrade")
	public ModelAndView toTrade(HttpServletRequest request) {
		// 获取当天的交易价格
		try {
			FrontUserRegisterEntity frontUser = ResourceUtil.getSessionFrontUser();
			String userName = frontUser.getUserName();
			UsdtPriceEntity usdtPrice = usdtPriceService.getNewPrice();
			UserUsdtInfoEntity usdtInfoEntity = userUsdtInfoService.queryUserUsdtByUserName(userName);
			String feerate = "1";
			TSConfigcodeEntity tsConfigcode = tsConfigcodeService.getConfigValue(OrderConstant.FeeRate);
			if(tsConfigcode != null) {
				feerate = tsConfigcode.getConfigValue();
			}
			request.setAttribute("feerate", feerate);
			request.setAttribute("userUsdtInfo", usdtInfoEntity);
			request.setAttribute("usdtPrice", usdtPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("smp/trade/tradeCenterMain");
	}


    /**
     * 买入usdt
     *
     * @return
     */
    @RequestMapping(params = "doBuy")
    @ResponseBody
    public AjaxJson doBuy(UsdtTradeInfo usdtTradeInfo, HttpServletRequest request) {
        String message = null;
        AjaxJson j = new AjaxJson();
        message = "USDT买入申请成功,待系统确认后冲入账户";
        try{

            systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
        }catch(Exception e){
            e.printStackTrace();
            message = "USDT买入失败,请稍后重试!";
            j.setSuccess(false);
//            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

    /**
     * 卖出usdt
     *
     * @return
     */
    @RequestMapping(params = "doSale")
    @ResponseBody
    public AjaxJson doSale(UsdtTradeInfo usdtTradeInfo, HttpServletRequest request) {
        String message = null;
        AjaxJson j = new AjaxJson();
        message = "USDT卖出申请成功，请等待处理";
        try{

            systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
        }catch(Exception e){
            e.printStackTrace();
            message = "USDT卖出申请失败，请稍后重试或联系客服!";
            j.setSuccess(false);
        }
        j.setMsg(message);
        return j;
    }

	/**
	 * USDT交易信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("/smp/deal/usdtTradeList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */
	@RequestMapping(params = "datagrid")
	public void datagrid(UsdtTradeEntity usdtTrade, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(UsdtTradeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, usdtTrade, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.usdtTradeService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

    /**
     * 审核通过
     *
     * @return
     */
    @RequestMapping(params = "auditpass")
    @ResponseBody
    public AjaxJson doAuditPass(UsdtTradeEntity usdtTrade, HttpServletRequest request) {
        String message = null;
        AjaxJson j = new AjaxJson();
        usdtTrade = systemService.getEntity(UsdtTradeEntity.class, usdtTrade.getId());
        message = "USDT交易信息审核成功";
        try{
            if(usdtTrade != null && "1".equals(usdtTrade.getTradeType())) { //买入
                usdtTradeService.buyAudit(usdtTrade, "1");
            }
            if(usdtTrade != null && "2".equals(usdtTrade.getTradeType())) { //卖出
                usdtTradeService.saleAudit(usdtTrade, "1");
            }
            systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
        }catch(Exception e){
            e.printStackTrace();
            message = "USDT交易信息审核失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

    /**
     * 审核不通过
     *
     * @return
     */
    @RequestMapping(params = "auditunpass")
    @ResponseBody
    public AjaxJson doAuditUnPass(UsdtTradeEntity usdtTrade, HttpServletRequest request) {
        String message = null;
        AjaxJson j = new AjaxJson();
        usdtTrade = systemService.getEntity(UsdtTradeEntity.class, usdtTrade.getId());
        message = "USDT交易信息审核成功";
        try{
            if(usdtTrade != null && "1".equals(usdtTrade.getTradeType())) { //买入
                usdtTradeService.buyAudit(usdtTrade, "0");
            }
            if(usdtTrade != null && "2".equals(usdtTrade.getTradeType())) { //卖出
                usdtTradeService.saleAudit(usdtTrade, "0");
            }
            systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
        }catch(Exception e){
            e.printStackTrace();
            message = "UUSDT交易信息审核失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

	/**
	 * 删除USDT交易信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(UsdtTradeEntity usdtTrade, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		usdtTrade = systemService.getEntity(UsdtTradeEntity.class, usdtTrade.getId());
		message = "USDT交易信息删除成功";
		try{
			usdtTradeService.delete(usdtTrade);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "USDT交易信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除USDT交易信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "USDT交易信息删除成功";
		try{
			for(String id:ids.split(",")){
				UsdtTradeEntity usdtTrade = systemService.getEntity(UsdtTradeEntity.class, 
				id
				);
				usdtTradeService.delete(usdtTrade);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "USDT交易信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加USDT交易信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(UsdtTradeEntity usdtTrade, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "USDT交易信息添加成功";
		try{
			usdtTradeService.save(usdtTrade);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "USDT交易信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新USDT交易信息
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(UsdtTradeEntity usdtTrade, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "USDT交易信息更新成功";
		UsdtTradeEntity t = usdtTradeService.get(UsdtTradeEntity.class, usdtTrade.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(usdtTrade, t);
			usdtTradeService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "USDT交易信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * USDT交易信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(UsdtTradeEntity usdtTrade, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(usdtTrade.getId())) {
			usdtTrade = usdtTradeService.getEntity(UsdtTradeEntity.class, usdtTrade.getId());
			req.setAttribute("usdtTradePage", usdtTrade);
		}
		return new ModelAndView("/smp/deal/usdtTrade-add");
	}
	/**
	 * USDT交易信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(UsdtTradeEntity usdtTrade, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(usdtTrade.getId())) {
			usdtTrade = usdtTradeService.getEntity(UsdtTradeEntity.class, usdtTrade.getId());
			req.setAttribute("usdtTradePage", usdtTrade);
		}
		return new ModelAndView("/smp/deal/usdtTrade-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","usdtTradeController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(UsdtTradeEntity usdtTrade,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(UsdtTradeEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, usdtTrade, request.getParameterMap());
		List<UsdtTradeEntity> usdtTrades = this.usdtTradeService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"USDT交易信息");
		modelMap.put(NormalExcelConstants.CLASS,UsdtTradeEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("USDT交易信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,usdtTrades);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(UsdtTradeEntity usdtTrade,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"USDT交易信息");
    	modelMap.put(NormalExcelConstants.CLASS,UsdtTradeEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("USDT交易信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<UsdtTradeEntity> listUsdtTradeEntitys = ExcelImportUtil.importExcel(file.getInputStream(),UsdtTradeEntity.class,params);
				for (UsdtTradeEntity usdtTrade : listUsdtTradeEntitys) {
					usdtTradeService.save(usdtTrade);
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
	public List<UsdtTradeEntity> list() {
        List<UsdtTradeEntity> listUsdtTrades=usdtTradeService.getList(UsdtTradeEntity.class);
		return listUsdtTrades;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		UsdtTradeEntity task = usdtTradeService.get(UsdtTradeEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody UsdtTradeEntity usdtTrade, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<UsdtTradeEntity>> failures = validator.validate(usdtTrade);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			usdtTradeService.save(usdtTrade);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = usdtTrade.getId();
		URI uri = uriBuilder.path("/rest/usdtTradeController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody UsdtTradeEntity usdtTrade) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<UsdtTradeEntity>> failures = validator.validate(usdtTrade);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		try{
			usdtTradeService.saveOrUpdate(usdtTrade);
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
		usdtTradeService.deleteEntityById(UsdtTradeEntity.class, id);
	}
}
