package cqut.yook.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cqut.yook.entiy.Teacher;
import cqut.yook.util.MybatisUtil;

public class TeacherDao {
	public Teacher getTeacher(int teacherId) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		Teacher teacher = session.selectOne("cqut.yook.entity.teacherMapper.getTeacher",teacherId);
		session.close();
		return teacher;
	}
}
