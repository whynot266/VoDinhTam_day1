package day2.javabasedconfiguration;

import day2.pojobeans.AccountService;
import day2.pojobeans.AccountRepository;
import day2.pojobeans.AccountRepositoryImpl;
import day2.pojobeans.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountDao());
        return bean;
    }
    @Bean
    public AccountRepository accountDao(){
        AccountRepositoryImpl bean= new AccountRepositoryImpl();
        return bean;
    }
}
