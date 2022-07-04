package com.xx.ssm.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.xx.ssm.domain.User;
import com.xx.ssm.service.UserService;

/**   
 * @ClassName: DemoController   
 * @Description: 示例   
 * @author: XiaWenQiang
 * @date: 2017年8月22日 下午2:01:22   
 *      
 */
@Controller
public class DemoController {

	private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 首页
	 */
	@RequestMapping("/")
	public String index() {
		LOG.debug("Received a requerst for / at : " + new Date());
		LOG.info("Received a requerst for / at : " + new Date());
		LOG.warn("Received a requerst for / at : " + new Date());
		LOG.error("Received a requerst for / at : " + new Date());
		return "index";
	}
	
	/**
	 * 查询用户
	 */
	@PostMapping("/user/query")
	@ResponseBody
	public User query(Long userid) {
		User user = userService.queryUserById(userid);
		LOG.info("userService's type is : " + userService.getClass().getName());
		return user;
	}

	/**
	 * 查询用户
	 */
	@GetMapping("/user/all")
	@ResponseBody
	public List<User> all() {
		List<User> userList = userService.queryList();
		LOG.info("userService's type is : " + userService.getClass().getName());
		return userList;
	}
}
