package com.cjn.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Good;
import com.cjn.mapping.GoodOperation;
import com.cjn.util.MybatisUtil;

public class GoodService {
	private static MybatisUtil mybatisUtil = new MybatisUtil();//新建一个mybatis的基础操作类
	private static GoodOperation goodOperation;//goodOperation的实例
	// 根据商品ID查找管理员
	public Good selectGoodById(int id) {
		SqlSession session = mybatisUtil.createSqlSession();
		Good good = new Good();
		try {
			goodOperation = session.getMapper(GoodOperation.class);
			good = goodOperation.selectGoodByID(id);
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return good;
	}
	// 显示商品列表
	public List<Good> selectGoods() {
		SqlSession session = mybatisUtil.createSqlSession();
		List<Good> goods = new ArrayList<>();
		try {
			goodOperation = session.getMapper(GoodOperation.class);
			goods = goodOperation.selectGoods();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return goods;
	}
	// 增加商品
	public void insertGood(Good good) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			goodOperation = session.getMapper(GoodOperation.class);
			goodOperation.addGood(good);
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
	// 更新商品信息
	public void updateGood(Good good) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			goodOperation = session.getMapper(GoodOperation.class);
			goodOperation.updateGood(good);
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
	// 删除商品
	public void deleteGood(int id) {
		SqlSession session = mybatisUtil.createSqlSession();
		try {
			goodOperation = session.getMapper(GoodOperation.class);
			goodOperation.deleteGood(id);
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
