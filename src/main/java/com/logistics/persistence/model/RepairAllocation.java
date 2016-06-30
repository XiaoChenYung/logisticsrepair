package com.logistics.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class RepairAllocation implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.repair_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long repairId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.repair_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long repairUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.opt_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long optUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_allocation.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_repair_allocation
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.id
	 * @return  the value of t_repair_allocation.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.id
	 * @param id  the value for t_repair_allocation.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.repair_id
	 * @return  the value of t_repair_allocation.repair_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getRepairId() {
		return repairId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.repair_id
	 * @param repairId  the value for t_repair_allocation.repair_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setRepairId(Long repairId) {
		this.repairId = repairId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.repair_user_id
	 * @return  the value of t_repair_allocation.repair_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getRepairUserId() {
		return repairUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.repair_user_id
	 * @param repairUserId  the value for t_repair_allocation.repair_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setRepairUserId(Long repairUserId) {
		this.repairUserId = repairUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.opt_user_id
	 * @return  the value of t_repair_allocation.opt_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getOptUserId() {
		return optUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.opt_user_id
	 * @param optUserId  the value for t_repair_allocation.opt_user_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setOptUserId(Long optUserId) {
		this.optUserId = optUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.create_time
	 * @return  the value of t_repair_allocation.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.create_time
	 * @param createTime  the value for t_repair_allocation.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_allocation.update_time
	 * @return  the value of t_repair_allocation.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_allocation.update_time
	 * @param updateTime  the value for t_repair_allocation.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}