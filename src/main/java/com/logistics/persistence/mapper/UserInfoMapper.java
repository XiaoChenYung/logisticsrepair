package com.logistics.persistence.mapper;

import com.logistics.persistence.model.UserInfo;
import com.logistics.persistence.model.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int countByExample(UserInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByExample(UserInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insert(UserInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insertSelective(UserInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	List<UserInfo> selectByExample(UserInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	UserInfo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKeySelective(UserInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKey(UserInfo record);
}