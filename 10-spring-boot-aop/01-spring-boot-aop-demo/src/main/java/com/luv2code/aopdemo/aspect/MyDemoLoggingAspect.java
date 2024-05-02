package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // @Before("execution(public void addAccount())") // It will match on any "void addAccount()" in any class.
    // @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")  // It will only match on "void addAccount()" for AccountDAO.
    // @Before("execution(public void add*())") // It will match on any method which has a name starting with "add" and has return type of "void" in any class.
    // @Before("execution(void add*())") // It will match on any method which has a name starting with "add" and has return type of "void" in any class. Modifier is optional
    // @Before("execution(* add*())") // It will match on any method which has a name starting with "add" and has any return type in any class. Modifier is optional
    // @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))") // It will match on any method in any class inside dao package.
    // @Before("execution(* add*(com.luv2code.aopdemo.Account))") // It will match on any method which has a name starting with "add" and has an Account parameter in any class.
    // @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
    // @Before("execution(* com.luv2code..add*(..))")
    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }
}
