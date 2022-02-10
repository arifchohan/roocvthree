package com.egeroo.roocvthree.loginform;

import javax.persistence.Entity;

import javax.persistence.Table;

import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;


@Entity
@Table( name = "ms_app_user" )
public class LoginForm {
	
	private int userid;
    private int roleid;
    private int failedloginattempt;
	private String from;
	
	//@Email(message = "Please provide valid username")
	@NotNull(message ="Username is a required field")
	private String username;
	
	@NotNull(message ="Password is a required field")
    //@Size(min=8, max=255)
	private String password;
	
	
	
	public int getUserid() {
        return userid;
    }
	
	public void setUserid(int UserID) {
        this.userid = UserID;
    }
	
	public String getUsername() {
        return username;
    }
	
	public void setUsername(String UserName) {
        this.username = UserName;
    }
	
	public String getPassword() {
        return password;
    }
	
	public void setPassword(String Password) {
        //this.password = DigestUtils.md5Hex(DigestUtils.md5Hex(Password));
		this.password = Password;
    }

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public int getFailedloginattempt() {
		return failedloginattempt;
	}

	public void setFailedloginattempt(int failedloginattempt) {
		this.failedloginattempt = failedloginattempt;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
    
}
