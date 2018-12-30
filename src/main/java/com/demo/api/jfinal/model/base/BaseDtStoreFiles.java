package com.demo.api.jfinal.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDtStoreFiles<M extends BaseDtStoreFiles<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setStorePath(java.lang.String storePath) {
		set("store_path", storePath);
	}
	
	public java.lang.String getStorePath() {
		return getStr("store_path");
	}

	public void setBelongMaterials(java.lang.Integer belongMaterials) {
		set("belong_materials", belongMaterials);
	}
	
	public java.lang.Integer getBelongMaterials() {
		return getInt("belong_materials");
	}

	public void setDelFlag(java.lang.Boolean delFlag) {
		set("del_flag", delFlag);
	}
	
	public java.lang.Boolean getDelFlag() {
		return get("del_flag");
	}

	public void setDataType(java.lang.Integer dataType) {
		set("data_type", dataType);
	}
	
	public java.lang.Integer getDataType() {
		return getInt("data_type");
	}

}