package com.putaoteng.task5.model;

public class User extends BasicVo{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2537018274528404377L;
	private long id;
	private String username;
	private String password;
	private long loginAt;
	private long createAt;
	
	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getLoginAt() {
		return loginAt;
	}

	public void setLoginAt(long loginAt) {
		this.loginAt = loginAt;
	}
	
	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + ", password=" + password + ", loginAt=" + loginAt
				+ ", createAt=" + createAt + "]";
	}
}
