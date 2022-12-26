package day3.annotationbasedconfiguration;

import day2.pojobeans.Account;
import day2.pojobeans.AccountRepository;
import day2.pojobeans.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountService2Impl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;



    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount){
        Account sourceAccount= accountRepository.find(fromAccountId);
        Account targetAccount= accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        targetAccount.setBalance(targetAccount.getBalance()+amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccount);
    }
    @Override
    public void depositMoney(long accountId, double amount) throws Exception{
        Account account= accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }
    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
