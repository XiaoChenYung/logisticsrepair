package com.logistics.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class RepairCategory implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_category.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_category.name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_category.des
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private String des;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_category.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_repair_category.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_repair_category
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_category.id
	 * @return  the value of t_repair_category.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_category.id
	 * @param id  the value for t_repair_category.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_category.name
	 * @return  the value of t_repair_category.name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_category.name
	 * @param name  the value for t_repair_category.name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_category.des
	 * @return  the value of t_repair_category.des
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public String getDes() {
		return des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_category.des
	 * @param des  the value for t_repair_category.des
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setDes(String des) {
		this.des = des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_category.create_time
	 * @return  the value of t_repair_category.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_category.create_time
	 * @param createTime  the value for t_repair_category.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_repair_category.update_time
	 * @return  the value of t_repair_category.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_repair_category.update_time
	 * @param updateTime  the value for t_repair_category.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}