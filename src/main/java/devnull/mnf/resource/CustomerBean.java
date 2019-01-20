package devnull.mnf.resource;

import devnull.mnf.model.Customer;
import devnull.mnf.resource.api.CustomerLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local(CustomerLocal.class)
public class CustomerBean implements CustomerLocal{

    @Override
    public void create(Customer customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer retrieve(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer update(Integer id, Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
