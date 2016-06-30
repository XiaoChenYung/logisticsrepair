package com.logistics.persistence.mapper;

import com.logistics.persistence.model.RepairCategory;
import com.logistics.persistence.model.RepairCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairCategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int countByExample(RepairCategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByExample(RepairCategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insert(RepairCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insertSelective(RepairCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	List<RepairCategory> selectByExample(RepairCategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	RepairCategory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExampleSelective(@Param("record") RepairCategory record,
			@Param("example") RepairCategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExample(@Param("record") RepairCategory record, @Param("example") RepairCategoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKeySelective(RepairCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKey(RepairCategory record);
}