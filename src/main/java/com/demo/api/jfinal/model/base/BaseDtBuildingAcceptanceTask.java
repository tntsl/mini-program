package com.demo.api.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDtBuildingAcceptanceTask<M extends BaseDtBuildingAcceptanceTask<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setTaskName(java.lang.String taskName) {
		set("task_name", taskName);
	}
	
	public java.lang.String getTaskName() {
		return getStr("task_name");
	}

	public void setCredentialsId(java.lang.Integer credentialsId) {
		set("credentials_id", credentialsId);
	}
	
	public java.lang.Integer getCredentialsId() {
		return getInt("credentials_id");
	}

	public void setCompletionCredentialsId(java.lang.Integer completionCredentialsId) {
		set("completion_credentials_id", completionCredentialsId);
	}
	
	public java.lang.Integer getCompletionCredentialsId() {
		return getInt("completion_credentials_id");
	}

	public void setHousekeeperId(java.lang.Integer housekeeperId) {
		set("housekeeper_id", housekeeperId);
	}
	
	public java.lang.Integer getHousekeeperId() {
		return getInt("housekeeper_id");
	}

	public void setGoodsListId(java.lang.Integer goodsListId) {
		set("goods_list_id", goodsListId);
	}
	
	public java.lang.Integer getGoodsListId() {
		return getInt("goods_list_id");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setDelFlag(java.lang.Boolean delFlag) {
		set("del_flag", delFlag);
	}
	
	public java.lang.Boolean getDelFlag() {
		return get("del_flag");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setCompanyId(java.lang.String companyId) {
		set("company_id", companyId);
	}
	
	public java.lang.String getCompanyId() {
		return getStr("company_id");
	}

	public void setIsAreaSenders(java.lang.Boolean isAreaSenders) {
		set("is_area_senders", isAreaSenders);
	}
	
	public java.lang.Boolean getIsAreaSenders() {
		return get("is_area_senders");
	}

	public void setFinishTime(java.util.Date finishTime) {
		set("finish_time", finishTime);
	}
	
	public java.util.Date getFinishTime() {
		return get("finish_time");
	}

	public void setOrderStatus(java.lang.Boolean orderStatus) {
		set("order_status", orderStatus);
	}
	
	public java.lang.Boolean getOrderStatus() {
		return get("order_status");
	}

	public void setRoomCount(java.lang.Integer roomCount) {
		set("room_count", roomCount);
	}
	
	public java.lang.Integer getRoomCount() {
		return getInt("room_count");
	}

	public void setPropertyOwnerCount(java.lang.Integer propertyOwnerCount) {
		set("property_owner_count", propertyOwnerCount);
	}
	
	public java.lang.Integer getPropertyOwnerCount() {
		return getInt("property_owner_count");
	}

	public void setAcceptanceFinishCount(java.lang.Integer acceptanceFinishCount) {
		set("acceptance_finish_count", acceptanceFinishCount);
	}
	
	public java.lang.Integer getAcceptanceFinishCount() {
		return getInt("acceptance_finish_count");
	}

	public void setReserveBeginDate(java.util.Date reserveBeginDate) {
		set("reserve_begin_date", reserveBeginDate);
	}
	
	public java.util.Date getReserveBeginDate() {
		return get("reserve_begin_date");
	}

	public void setReserveEndDate(java.util.Date reserveEndDate) {
		set("reserve_end_date", reserveEndDate);
	}
	
	public java.util.Date getReserveEndDate() {
		return get("reserve_end_date");
	}

}