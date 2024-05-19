import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

import java.util.List;

public class ClientJWS {
    public static void main(String[] args) {
        BankService proxy = new BankWS().getBankServicePort();
        System.out.println("convert(1000) = " + proxy.convert(1000));
        Account account = proxy.getAccount(1);
        printAccount(account);

        List<Account> accounts = proxy.getAccounts();
        accounts.forEach(ClientJWS::printAccount);
    }

    private static void printAccount(Account account) {
        System.out.println("Bank account:");
        System.out.println("Id " + account.getId());
        System.out.println("Balance " + account.getBalance());
        System.out.println("Creation date " + account.getCreationDate());
    }
}
