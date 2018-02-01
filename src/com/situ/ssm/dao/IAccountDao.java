package com.situ.ssm.dao;

import org.apache.ibatis.annotations.Param;

public interface IAccountDao {

	void decreaseMoney(@Param("AccountId")Integer AccountId,@Param("money") Integer money);
	void increaseMoney(@Param("AccountId")Integer AccountId, @Param("money")Integer money);
}
