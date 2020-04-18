package cqut.yook.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
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

	// 分页查询
	public List<Account> selectAllAccount(int currentPage, int pageSize) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		Map<String, Integer> map = new HashMap<>();
		map.put("startIndex", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		List<Account> account = session.selectList("cqut.yook.entity.AccountMapper.selectAllAccount", map);
		session.close();
		return account;
	}

	// 分页查询
	public List<Account> getAllAccount(int currentPage, int pageSize) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
		List<Account> account = session.selectList("cqut.yook.entity.AccountMapper.getAllAccount", null, rowBounds);
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
