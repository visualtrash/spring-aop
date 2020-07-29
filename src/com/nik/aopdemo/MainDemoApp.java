package com.nik.aopdemo;

import com.nik.aopdemo.dao.AccountDAO;
import com.nik.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        //get bean from spring container
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        //call method
        Account myAccount = new Account();
        accountDAO.addAccount(myAccount, true);
        accountDAO.doWork();

        //call membership method
        membershipDAO.addSillyMember();
        membershipDAO.goToSleep();

        //close context
        context.close();
    }
}
