package com.demo.api.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDtBuildingAcceptor<M extends BaseDtBuildingAcceptor<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setBuildingId(java.lang.Integer buildingId) {
		set("building_id", buildingId);
	}
	
	public java.lang.Integer getBuildingId() {
		return getInt("building_id");
	}

	public void setOrderId(java.lang.String orderId) {
		set("order_id", orderId);
	}
	
	public java.lang.String getOrderId() {
		return getStr("order_id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setCertificate(java.lang.String certificate) {
		set("certificate", certificate);
	}
	
	public java.lang.String getCertificate() {
		return getStr("certificate");
	}

	public void setIdCard(java.lang.String idCard) {
		set("id_card", idCard);
	}
	
	public java.lang.String getIdCard() {
		return getStr("id_card");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setIsAdult(java.lang.Boolean isAdult) {
		set("is_adult", isAdult);
	}
	
	public java.lang.Boolean getIsAdult() {
		return get("is_adult");
	}

	public void setKeeperId(java.lang.Integer keeperId) {
		set("keeper_id", keeperId);
	}
	
	public java.lang.Integer getKeeperId() {
		return getInt("keeper_id");
	}

	public void setRelation(java.lang.String relation) {
		set("relation", relation);
	}
	
	public java.lang.String getRelation() {
		return getStr("relation");
	}

	public void setAcceptorType(java.lang.Integer acceptorType) {
		set("acceptor_type", acceptorType);
	}
	
	public java.lang.Integer getAcceptorType() {
		return getInt("acceptor_type");
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

	public void setModifyTime(java.util.Date modifyTime) {
		set("modify_time", modifyTime);
	}
	
	public java.util.Date getModifyTime() {
		return get("modify_time");
	}

}