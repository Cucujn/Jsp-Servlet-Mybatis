package com.cjn.entity;

public class Admin {
	private String AdminName;// 管理员用户名
	private int AdminId;// 管理员id
	private String AdminPassword;// 管理员密码

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminPassword() {
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [AdminName=" + AdminName + ", AdminId=" + AdminId + ", AdminPassword=" + AdminPassword + "]";
	}

}
