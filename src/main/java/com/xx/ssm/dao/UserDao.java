package com.xx.ssm.dao;

import com.xx.ssm.domain.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**   
 * @ClassName: IUserDao   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午10:48:11   
 *      
 */
@CacheNamespace
public interface UserDao {

	User findById(Long userid);

	List<User> findList(Map<String, Integer> params);

	@Options(flushCache = Options.FlushCachePolicy.TRUE)
	int updateUsername(@Param("username") String username, @Param("userid") Integer userid);
}
