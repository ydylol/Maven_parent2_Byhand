package com.rendiyu.dao;

import com.rendiyu.pojo.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();
}
