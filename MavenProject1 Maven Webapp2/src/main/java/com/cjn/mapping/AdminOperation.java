package com.cjn.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Admin;

public interface AdminOperation {
	public Admin selectAdminByID(int id);// 根据管理员账号查找管理员

	public List<Admin> selectAdmins();// 显示管理员列表

	public void addAdmin(Admin admin);// 增加管理员

	public void updateAdmin(Admin admin);// 更新管理员信息

	public void deleteAdmin(int id);// 删除管理员
}
