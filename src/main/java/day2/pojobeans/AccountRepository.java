package day2.pojobeans;

import day2.pojobeans.Account;

public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
