package com.xx.ssm.dao;

import com.xx.ssm.domain.User;

/**   
 * @ClassName: IUserDao   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午10:48:11   
 *      
 */
public interface UserDao {

	public User findById(Long userid);
}
