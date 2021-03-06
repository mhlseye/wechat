package com.cdeledu.controller.system.monitor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdeledu.common.constants.SystemConstant.SysOpType;
import com.cdeledu.controller.BaseController;
import com.cdeledu.core.annotation.SystemLog;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 *
 * Today the best performance as tomorrow newest starter!
 *
 * @类描述: 会话管理
 * @创建者: 皇族灬战狼
 * @创建时间: 2017年12月1日 下午5:07:21
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("sysSession")
public class SysSessionController extends BaseController {
	/** ----------------------------------------------------- Fields start */
	private static final long serialVersionUID = 1L;
	/** ----------------------------------------------------- Fields end */
	/** ----------------------------------------------------- Fields end */
	@SystemLog(desc = "查询会话", opType = SysOpType.SELECT, tableName = "sys_session")
	@RequestMapping(value = "getList")
	public void getList() {

	}

	@SystemLog(desc = "删除会话", opType = SysOpType.SELECT, tableName = "sys_session")
	@RequestMapping(value = "delete")
	public void delete() {

	}
}
