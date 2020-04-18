package cqut.yook.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cqut.yook.dao.AccountDao;
import cqut.yook.entiy.Account;
import cqut.yook.util.MybatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		AccountDao accountDao = session.getMapper(AccountDao.class);
		List<Account> list = accountDao.selectAllAccount();
		list.forEach(item -> System.out.println(item));
	}
}
