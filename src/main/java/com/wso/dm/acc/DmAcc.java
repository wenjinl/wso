package com.wso.dm.acc;

import java.util.Date;

/**
 * 3大模块。账户管理，用户管理，权限管理，
 * 3大功能，登录验证，登录日志，账户注册
 * @author wenjl
 *
 */
public class DmAcc {

    private Integer kid;

    private String accEmail;

    private String accNa;

    private String userNa;

    private String password;

    private Integer webKid;//各网站注册的用户，0为通用的wsg用户，其他为个网站kid

    private Integer nsta;

    private Integer nAdmin;//是否是超级管理员 wsAdmin中nsta

    private Date loginTime;//最后登录时间，wsloginlog

    private Integer bLog;//记录是否登录过***********

    private Integer orgId;//所属机构id。

    private Integer nRole;//-1 已禁用，0 操作员，1系统管理员，2普通管理员，3超级管理员

    public Integer getnRole() {
        return nRole;
    }

    public void setnRole(Integer nRole) {
        this.nRole = nRole;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getAccEmail() {
        return accEmail;
    }

    public void setAccEmail(String accEmail) {
        this.accEmail = accEmail;
    }

    public String getUserNa() {
        return userNa;
    }

    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public Integer getbLog() {
        return bLog;
    }

    public void setbLog(Integer bLog) {
        this.bLog = bLog;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }


    public Integer getnAdmin() {
        return nAdmin;
    }

    public void setnAdmin(Integer nAdmin) {
        this.nAdmin = nAdmin;
    }

    public Integer getWebKid() {
        return webKid;
    }

    public void setWebKid(Integer webKid) {
        this.webKid = webKid;
    }

    public Integer getNsta() {
        return nsta;
    }

    public void setNsta(Integer nsta) {
        this.nsta = nsta;
    }

    public String getAccNa() {
        return accNa;
    }

    public void setAccNa(String accNa) {
        this.accNa = accNa;
    }


    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
