package cqut.yook.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import cqut.yook.dao.AccountDao;

public class Test {
	public static void main(String[] args) throws IOException {
		AccountDao dao = new AccountDao();
		Map<String,String> map = new HashMap<>();
		map.put("name", "y");
		System.out.println(dao.getAccountByCondition(map));
	}
}
