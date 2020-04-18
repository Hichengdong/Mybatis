package cqut.yook.test;

import java.io.IOException;

import cqut.yook.dao.TeacherDao;
import cqut.yook.entiy.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.getTeacher(1);
		System.out.println(teacher);
	}
}
