package day2ex.pojobeans.main;

import day2.javabasedconfiguration.BeanConfiguration;
import day2.pojobeans.AccountService;
import day2ex.pojobeans.Draw;
import day2ex.pojobeans.DrawCircle;
import day2ex.pojobeans.StudentTools;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("day2ex/beans.xml");
        Draw draw = applicationContext.getBean("draw", Draw.class);
        draw.draw();

    }

}
