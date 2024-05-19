package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BankService {
    /**
     * Convert currency from EUR to MAD
     * @return the converted amount
     */
    @WebMethod(operationName = "convert")
    public double convert(@WebParam(name = "amount") double amount) {
        return amount * 10.79;
    }

    /**
     * Get an account by its id
     * @param id the account id
     * @return the account
     */
    @WebMethod(operationName = "getAccount")
    public Account getAccount(@WebParam(name = "id") int id) {
        Account account = new Account();
        account.setId(id);
        account.setBalance(1000);
        account.setCreationDate(new Date());
        return account;
    }

    /**
     * Get all accounts
     * @return the list of accounts
     */
    @WebMethod(operationName = "getAccounts")
    public List<Account> getAccounts() {
        return List.of(
            new Account(1, 1000, new Date()),
            new Account(2, 2000, new Date()),
            new Account(3, 3000, new Date())
        );
    }
}
