package devnull.mnf.resource;

import devnull.mnf.resource.api.AuthLocal;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Singleton
@Local(AuthLocal.class)
public class AuthBean implements AuthLocal{

    @Context
    private ServletContext servletContext;

    @Context
    private HttpServletRequest requestContext;


    @Override
    public Response login(String username, String password) throws Exception {
        HttpSession session = requestContext.getSession(true);
        return Response.accepted().cookie(new NewCookie("accessToken", session.getId(), servletContext.getContextPath(), requestContext.getHeader("Host"), "access token", Integer.MAX_VALUE, false)).build();
    }

    @Override
    public void logout() throws Exception {
        //TODO invalidate accessToken
    }

}
