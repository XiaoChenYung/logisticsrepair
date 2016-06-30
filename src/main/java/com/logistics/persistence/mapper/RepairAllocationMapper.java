package com.logistics.persistence.mapper;

import com.logistics.persistence.model.RepairAllocation;
import com.logistics.persistence.model.RepairAllocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairAllocationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int countByExample(RepairAllocationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByExample(RepairAllocationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insert(RepairAllocation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insertSelective(RepairAllocation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	List<RepairAllocation> selectByExample(RepairAllocationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	RepairAllocation selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExampleSelective(@Param("record") RepairAllocation record,
			@Param("example") RepairAllocationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExample(@Param("record") RepairAllocation record, @Param("example") RepairAllocationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKeySelective(RepairAllocation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKey(RepairAllocation record);
}