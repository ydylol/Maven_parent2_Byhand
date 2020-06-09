package com.rendiyu.service.impl;

import com.rendiyu.dao.AccountDao;
import com.rendiyu.pojo.Account;
import com.rendiyu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao dao;

    @Override
    public List<Account> findAll() {
        return dao.findAll();
    }
}
