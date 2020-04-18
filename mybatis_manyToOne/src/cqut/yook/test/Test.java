package cqut.yook.test;

import java.io.IOException;
import java.util.List;

import cqut.yook.dao.StudentDao;
import cqut.yook.entiy.Student;

public class Test {
	public static void main(String[] args) throws IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> list = studentDao.getStudents();
		list.forEach(item ->System.out.println(item));
	}
}
