package cqut.yook.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cqut.yook.entiy.Account;
import cqut.yook.util.MybatisUtil;

public class AccountDao {
	public Account selectAccount(int id) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		Account account = session.selectOne("cqut.yook.entity.AccountMapper.selectAccount", id);
		session.close();
		return account;
	}

	public List<Account> selectAllAccount() throws IOException {
		SqlSession session = MybatisUtil.getSession();
		List<Account> account = session.selectList("cqut.yook.entity.AccountMapper.selectAllAccount");
		session.close();
		return account;
	}

	public int insertAccount(Account account) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.insert("cqut.yook.entity.AccountMapper.insertAccount", account);
		session.commit();
		session.close();
		return result;
	}

	public int updateAccount(Account account) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.update("cqut.yook.entity.AccountMapper.updateAccount", account);
		session.commit();
		session.close();
		return result;
	}

	public int deleteAccount(int id) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		int result = session.delete("cqut.yook.entity.AccountMapper.deleteAccount", id);
		session.commit();
		session.close();
		return result;
	}
}
