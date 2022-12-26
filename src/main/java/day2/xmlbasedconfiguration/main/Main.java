package day2.xmlbasedconfiguration.main;


import day2.javabasedconfiguration.BeanConfiguration;

import day2.pojobeans.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccountService accountService= applicationContext.getBean("accountService", AccountService.class);
        System.out.println("Before transfer money");
        System.out.println("Account 1 balance:"+ accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance:"+ accountService.getAccount(2).getBalance());

        accountService.transferMoney(1,2,5.0);
        System.out.println("======================");
        System.out.println("After transfer");
        System.out.println("Account 1 balance:"+ accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance:"+ accountService.getAccount(2).getBalance());

    }
}