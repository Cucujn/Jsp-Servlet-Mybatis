package com.cjn.mapping;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Type;

public interface TypeOperation {
	public Type selectTypeByID(int id);// 根据商品种类ID查找

	public List<Type> selectTypes();// 显示商品种类列表

	public void addType(Type type);// 增加商品种类

	public void updateType(Type type);// 更新商品种类信息

	public void deleteType(int id);// 删除商品种类
}
