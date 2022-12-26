package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("xmlbasedconfiguration/beans");
        Account account1= context.getBean("account1", Account.class);
        Account account2= context.getBean("account2", Account.class);
        System.out.println(account2.getBalance());
        System.out.println(account1.getOwnerName());
        System.out.println(account1.getBalance());
    }
}