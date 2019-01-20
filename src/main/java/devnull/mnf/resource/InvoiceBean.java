package devnull.mnf.resource;

import devnull.mnf.model.Invoice;
import devnull.mnf.resource.api.InvoiceLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local(InvoiceLocal.class)
public class InvoiceBean implements InvoiceLocal{

    @Override
    public void create(Invoice invoice) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invoice retrieve(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invoice update(Integer id, Invoice invoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
