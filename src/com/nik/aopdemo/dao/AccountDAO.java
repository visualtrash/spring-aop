package com.nik.aopdemo.dao;

import com.nik.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass() + "MY DB WORK.. ADDING ACCOUNT...");
    }

    public boolean doWork() {

        System.out.println(getClass() + ": doWork()");

        return false;
    }
}
