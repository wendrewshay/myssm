package com.xx.ssm.domain;

import java.io.Serializable;

/**   
 * @ClassName: User   
 * @Description: 用户实体   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午11:00:43   
 *      
 */
public class User implements Serializable{

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 1L;
	private Long userid;
	private String username;
	private String password;
	private int age;
	private String gender;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userid="+userid+", username="+username+", age="+age+", gender="+gender+"]";
	}
	
}
