package cqut.yook.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cqut.yook.entiy.Student;
import cqut.yook.util.MybatisUtil;

public class StudentDao {
	public List<Student> getStudents() throws IOException {
		SqlSession session = MybatisUtil.getSession();
		List<Student> account = session.selectList("cqut.yook.entity.studentMapper.getStudents");
		session.close();
		return account;
	}
}
