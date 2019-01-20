package devnull.mnf.resource;

import devnull.mnf.model.Account;
import devnull.mnf.resource.api.AccountLocal;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@Singleton
@Local(AccountLocal.class)
public class AccountBean implements AccountLocal {

    @PersistenceUnit
    private EntityManager entityManager;

    @Override
    public Collection<Account> retrieveAll() throws Exception {
        return calculateSummaries(entityManager.createQuery("select o from Account o", Account.class).getResultList());
    }

    private Collection<Account> calculateSummaries(List<Account> resultList) {
        resultList.stream().forEach(account -> {
            account.getCustomers().stream().forEach(customer -> {
                customer.getInvoices().stream().forEach(invoice -> {
                    customer.setCustomerTotal(customer.getCustomerTotal() + invoice.getCurrency());
                });
                account.setAccountTotal(account.getAccountTotal() + customer.getCustomerTotal());
            });

        });
        return resultList;
    }

}
