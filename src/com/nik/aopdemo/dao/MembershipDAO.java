package com.nik.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addSillyMember() {

        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACC");

        return true;
    }

    public void goToSleep() {

        System.out.println(getClass() + ": DOING STUFF: zzZ SLEEPING Zzz..");

    }
}
