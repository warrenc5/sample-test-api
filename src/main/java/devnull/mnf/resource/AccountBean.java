package devnull.mnf.resource;

import devnull.mnf.model.Account;
import devnull.mnf.resource.api.AccountLocal;
import java.util.Collection;
import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local(AccountLocal.class)
public class AccountBean implements AccountLocal{

    @Override
    public Collection<Account> retrieveAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
