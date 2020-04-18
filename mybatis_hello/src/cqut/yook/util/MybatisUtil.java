package cqut.yook.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MybatisUtil {
	// ����SqlSessionFactory ��һ��SqlSession�Ĺ���
	public static SqlSessionFactory getSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	
	// ��ȡSqlSession ͨ��id�ҵ���Ӧ��SQL��䣬ִ��SQL���
	public static SqlSession getSession() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
