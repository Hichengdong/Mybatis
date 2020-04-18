package cqut.yook.test;

import java.io.IOException;

import cqut.yook.dao.AccountDao;

public class Test {
	public static void main(String[] args) throws IOException {
		AccountDao dao = new AccountDao();
		System.out.println(dao.selectAllAccount());
	}
}
