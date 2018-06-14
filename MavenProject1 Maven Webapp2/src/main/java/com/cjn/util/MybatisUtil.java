package com.cjn.util;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisUtil {
	private static SqlSessionFactory sqlSessionFactory = null;
	//构建一个可以返回session对象的方法
	public static SqlSession createSqlSession() {
		SqlSession session = null;
		if(sqlSessionFactory==null) {
			String resource = "Configuration.xml";
			Reader reader;
			SqlSessionFactory sqlSessionFactory = null;
			try {
				reader = Resources.getResourceAsReader(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				session = sqlSessionFactory.openSession();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			session = sqlSessionFactory.openSession();
		}
		return session;
		
		
	}
}
