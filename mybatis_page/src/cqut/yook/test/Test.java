package cqut.yook.test;

import java.io.IOException;
import java.util.List;

import cqut.yook.dao.AccountDao;
import cqut.yook.entiy.Account;

public class Test {
	public static void main(String[] args) throws IOException {
		AccountDao dao = new AccountDao();
		List<Account> list = dao.getAllAccount(1, 2);
		list.forEach(System.out::println);
//		list.forEach(item->System.out.println(item));
	}
}
