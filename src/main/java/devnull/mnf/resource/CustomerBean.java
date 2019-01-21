package devnull.mnf.resource;

import devnull.mnf.model.Customer;
import devnull.mnf.resource.api.CustomerLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.dozer.DozerBeanMapper;

@Singleton
@Local(CustomerLocal.class)
public class CustomerBean implements CustomerLocal{

    @PersistenceContext
    private EntityManager entityManager;
    private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    @Override
    public void create(Customer customer) throws Exception {
        entityManager.persist(customer);
    }

    @Override
    public Customer retrieve(Integer id) {
        return entityManager.find(Customer.class,id);
    }

    @Override
    public Customer update(Integer id, Customer customer) {
        Customer existingCustomer = entityManager.find(Customer.class,id);
        dozerBeanMapper.map(customer, existingCustomer);
        entityManager.merge(existingCustomer);
        return existingCustomer;
    }

    @Override
    public void delete(Integer id) {
        Customer existingCustomer = entityManager.find(Customer.class,id);
        entityManager.remove(existingCustomer);
    }
    
}
