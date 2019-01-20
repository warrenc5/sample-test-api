package devnull.mnf.resource;

import devnull.mnf.model.Invoice;
import devnull.mnf.resource.api.InvoiceLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import org.dozer.DozerBeanMapper;

@Singleton
@Local(InvoiceLocal.class)
public class InvoiceBean implements InvoiceLocal{

    @PersistenceUnit
    private EntityManager entityManager;
    private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    @Override
    public void create(Invoice invoice) throws Exception {
        entityManager.persist(invoice);
    }

    @Override
    public Invoice retrieve(Integer id) {
        return entityManager.find(Invoice.class,id);
    }

    @Override
    public Invoice update(Integer id, Invoice invoice) {
        Invoice existingInvoice = entityManager.find(Invoice.class,id);
        dozerBeanMapper.map(invoice, existingInvoice);
        entityManager.merge(existingInvoice);
        return existingInvoice;
}

    @Override
    public void delete(Integer id) {
        Invoice existingInvoice = entityManager.find(Invoice.class,id);
        entityManager.remove(existingInvoice);
    }
    
}
