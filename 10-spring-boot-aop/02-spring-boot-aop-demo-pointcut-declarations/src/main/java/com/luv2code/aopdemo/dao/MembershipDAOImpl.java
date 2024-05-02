package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public void addMember() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBER");
    }

    @Override
    public boolean addBooleanMember() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A BOOLEAN MEMBER");
        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": DOING MY SLEEP WORK");
    }
}
