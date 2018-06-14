package com.cjn.mapping;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Good;

public interface GoodOperation {
	public Good selectGoodByID(int id);// 根据商品ID查找管理员

	public List<Good> selectGoods();// 显示商品列表

	public void addGood(Good good);// 增加商品

	public void updateGood(Good good);// 更新商品信息

	public void deleteGood(int id);// 删除商品
}
