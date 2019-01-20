package devnull.mnf.app;

import devnull.mnf.resource.api.AuthLocal;
import devnull.mnf.resource.api.CustomerLocal;
import devnull.mnf.resource.api.InvoiceLocal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import devnull.mnf.resource.api.AccountLocal;

@ApplicationPath("api")
@Stateless
public class MNFApplication extends Application {

    @Inject
    AccountLocal service;

    @Inject
    CustomerLocal customer;

    @Inject
    InvoiceLocal invoice;

    @Inject
    AuthLocal auth;

    @Context
    protected ServletContext servletContext;

    @Override
    public Set<Object> getSingletons() {
        return new HashSet<>(Arrays.asList(service,customer,invoice,auth));
    }

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>();
    }

}
