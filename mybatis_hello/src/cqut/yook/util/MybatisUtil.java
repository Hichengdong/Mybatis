package cqut.yook.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisUtil {
	// 创建SqlSessionFactory 是一个SqlSession的工厂
	public static SqlSessionFactory getSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	// 获取SqlSession 通过id找到对应的SQL语句，执行SQL语句
	public static SqlSession getSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
