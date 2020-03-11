package com.wso.dm.user;

public class DmLoginUser {
	private Integer kid;

	private String userName;

	private Integer accKid;

	private String sex;

	private String address;

	private String birthday;

	private Integer nrole;//管理角色。0 普通管理员，1 超级管理员，2系统管理员

	private String tblNa;
	
	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAccKid() {
		return accKid;
	}

	public void setAccKid(Integer accKid) {
		this.accKid = accKid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getNrole() {
		return nrole;
	}

	public void setNrole(Integer nrole) {
		this.nrole = nrole;
	}

	public String getTblNa() {
		return tblNa;
	}

	public void setTblNa(String tblNa) {
		this.tblNa = tblNa;
	}
	
}
