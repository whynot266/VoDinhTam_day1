package day2.pojobeans;

public interface AccountService {
    void transferMoney( long fromAccountId, long toAccountId, double amount);
    void depositMoney(long AccountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
