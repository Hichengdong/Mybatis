package cqut.yook.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cqut.yook.entiy.Account;
import cqut.yook.util.MybatisUtil;

public class AccountDao {
	public List<Account> getAccountByCondition(Map<String,String> map) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		List<Account> account = session.selectList("cqut.yook.entity.AccountMapper.getAccountByCondition",map);
		session.close();
		return account;
	}
}
