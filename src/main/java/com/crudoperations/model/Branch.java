package com.crudoperations.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Branch {
	
	String id;
	String branchName;
	String branchCode;
	String branchEmail;
	String modifiedBy;
	
	
	
	
	public Branch() {
		super();
	}
	public Branch(String branchName, String branchCode, String branchEmail) {
		super();
	
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.branchEmail = branchEmail;
	}
	
	
	public Branch(String id, String branchName, String branchCode, String branchEmail, String modifiedBy) {
		super();
		this.id = id;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.branchEmail = branchEmail;
		this.modifiedBy = modifiedBy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchEmail() {
		return branchEmail;
	}
	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	

}
