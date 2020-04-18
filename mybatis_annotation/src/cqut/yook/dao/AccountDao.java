package cqut.yook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cqut.yook.entiy.Account;

public interface AccountDao {
	@Select("select * from account")
	public List<Account> selectAllAccount();
}
