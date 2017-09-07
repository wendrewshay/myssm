package com.xx.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xx.ssm.dao.UserDao;
import com.xx.ssm.domain.User;

/**   
 * @ClassName: UserService   
 * @Description: 用户服务类   
 * @author: XiaWenQiang
 * @date: 2017年8月22日 下午2:32:17   
 *      
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User queryUserById(long userid) {
		return userDao.findById(userid);
	}
}
