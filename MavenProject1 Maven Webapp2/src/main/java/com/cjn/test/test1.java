package com.cjn.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cjn.entity.Admin;
import com.cjn.entity.Good;
import com.cjn.entity.Type;
import com.cjn.mapping.AdminOperation;
import com.cjn.mapping.GoodOperation;
import com.cjn.service.AdminService;
import com.cjn.service.GoodService;
import com.cjn.service.TypeService;
import com.cjn.util.MybatisUtil;

public class test1 {
	/*private static MybatisUtil mybatisUtil = new MybatisUtil();
	public static void main(String[] args) {
		SqlSession sqlSession = mybatisUtil.createSqlSession();
		AdminOperation adminOperation = sqlSession.getMapper(AdminOperation.class);
		Admin admin = adminOperation.selectAdminByID(2);
		System.out.println(admin);
		GoodOperation goodOperation = sqlSession.getMapper(GoodOperation.class);
		Good good = goodOperation.selectGoodByID(1);
		System.out.println(good);
	}*/
	public static void main(String[] args) {
		/*GoodService goodService = new GoodService();
		Good good = goodService.selectGoodById(1);
		Type goodtype = new Type(); 
		goodtype.setTypeName("��ʳ");
		System.out.println(good);
		Good good2 = new Good();
		good2.setGoodName("����");
		good2.setGoodPrice(5);
		good2.setGoodStore(10);
		good2.setGoodType(goodtype);
		good2.setGoodId(2);
		goodService.updateGood(good2);
		goodService.deleteGood(2);
		List<Good> goods = goodService.selectGoods();
		for (Good good3 : goods) {
			System.out.println(good3);
		}*/
		/*AdminService adminService = new AdminService();
		Admin admin = adminService.selectAdminById(0);
		System.out.println(admin);*/
		/*Admin admin2 = new Admin();
		admin2.setAdminName("�½���");
		admin2.setAdminPassword("123456");
		adminService.insertAdmin(admin2);*/
		/*admin.setAdminName("��");*/
		/*Admin admin2 = adminService.selectAdminById(3);
		admin2.setAdminName("һ��");
		adminService.updateAdmin(admin2);
		List<Admin> admins = adminService.selectAdmins();
		for (Admin admin3 : admins) {
			System.out.println(admin3);
		}*/
		/*TypeService typeService = new TypeService();
		Type type = typeService.selectTypeById(1);
		System.out.println(type);
		Type type2 = new Type();
		type2.setTypeName("����");
		typeService.insertType(type2);
		Type type = typeService.selectTypeById(1);
		type.setTypeName("����");
		typeService.updateType(type);*/
		//typeService.deleteType(3);
		TypeService typeService = new TypeService();
	//	Type type4 = typeService.selectTypeById(5);
		/*type4.setTypeName("水果");
		typeService.updateType(type4);*/
		Type type2 = new Type();
		type2.setTypeName("奶茶");
		typeService.insertType(type2);
		List<Type> types = typeService.selectTypes();
		for (Type type3 : types) {
			System.out.println(type3);
		}
		/*GoodService goodService = new GoodService();
		goodService.deleteGood(8);
		List<Good> goods = goodService.selectGoods();
		for (Good good3 : goods) {
			System.out.println(good3);*/
		
	}
	}



