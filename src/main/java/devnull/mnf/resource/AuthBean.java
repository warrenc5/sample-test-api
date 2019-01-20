package devnull.mnf.resource;

import devnull.mnf.resource.api.AuthLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;

@Singleton
@Local(AuthLocal.class)
public class AuthBean implements AuthLocal{

    @Override
    public void login(String username, String password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
