package com.cjn.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Type;
import com.cjn.mapping.TypeOperation;
import com.cjn.util.MybatisUtil;

public class TypeService {
	private static MybatisUtil mybatisUtil = new MybatisUtil();
	private static TypeOperation typeOperation;
	// 根据商品种类ID查找
	public Type selectTypeById(int id) {
		SqlSession session = mybatisUtil.createSqlSession();
		Type type = new Type();
		try {
			typeOperation = session.getMapper(TypeOperation.class);
			type = typeOperation.selectTypeByID(id);
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return type;
	}
	// 显示商品种类列表
	public List<Type> selectTypes() {
		SqlSession session = mybatisUtil.createSqlSession();
		List<Type> types = new ArrayList<>();
		try {
			typeOperation = session.getMapper(TypeOperation.class);
			types = typeOperation.selectTypes();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return types;
	}
	// 增加商品种类
	public void insertType(Type type) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			typeOperation = session.getMapper(TypeOperation.class);
			typeOperation.addType(type);
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
	// 更新商品种类信息
	public void updateType(Type type) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			typeOperation = session.getMapper(TypeOperation.class);
			typeOperation.updateType(type);
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
	// 更新商品种类信息
	public void deleteType(int id) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			typeOperation = session.getMapper(TypeOperation.class);
			typeOperation.deleteType(id);
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
