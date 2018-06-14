package com.cjn.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Admin;
import com.cjn.mapping.AdminOperation;
import com.cjn.util.MybatisUtil;

public class AdminService {
	private static MybatisUtil mybatisUtil = new MybatisUtil();//新建一个mybatis的基础操作类
	private static AdminOperation adminOperation;//adminOperation的实例
	//根据id查找管理员的操作
	public Admin selectAdminById(int id) {
		SqlSession session = mybatisUtil.createSqlSession();//得到Sqlsession的对象
		Admin admin = new Admin();
		try {
			adminOperation = session.getMapper(AdminOperation.class);
			admin = adminOperation.selectAdminByID(id);
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return admin;
	}
	//显示管理员列表
	public List<Admin> selectAdmins() {
		SqlSession session = mybatisUtil.createSqlSession();
		List<Admin> admins = new ArrayList<>();
		try {
			adminOperation = session.getMapper(AdminOperation.class);
			admins = adminOperation.selectAdmins();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return admins;
	}
	// 增加管理员
	public void insertAdmin(Admin admin) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			adminOperation = session.getMapper(AdminOperation.class);
			adminOperation.addAdmin(admin);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
	}
	// 更新管理员信息
	public void updateAdmin(Admin admin) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			adminOperation = session.getMapper(AdminOperation.class);
			adminOperation.updateAdmin(admin);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
	}
	// 删除管理员
	public void deleteAdmin(int id) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			adminOperation = session.getMapper(AdminOperation.class);
			adminOperation.deleteAdmin(id);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
	}
}
