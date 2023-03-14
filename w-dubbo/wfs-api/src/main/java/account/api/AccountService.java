package account.api;

public interface AccountService {

    void debit(String userId, int money);
}
