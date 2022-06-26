package com.xx.ssm.service;

import com.xx.ssm.dao.UserDao;
import com.xx.ssm.domain.User;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**   
 * @ClassName: UserService   
 * @Description: 用户服务类   
 * @author: XiaWenQiang
 * @date: 2017年8月22日 下午2:32:17   
 *      
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public User queryUserById(long userid) {
		userDao.findById(userid);
		return userDao.findById(userid);
	}

	public List<User> queryList() {
//		SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.REUSE);
		Map<String, Integer> params = new HashMap<>();
		params.put("offset", 0);
		params.put("pageSize", 2);
		System.out.println(userDao.findList(params));
        userDao.updateUsername("张三丰", 1L);
		List<User> list = userDao.findList(params);
		System.out.println(list);
//		sqlSession.commit();
		return list;
	}

	@Transactional(rollbackFor = Exception.class)
	public void updateUsername(Long userid, String username) {
		User user = userDao.findById(userid);
		userDao.updateUsername(user.getUsername() + username, userid);
	}
}
