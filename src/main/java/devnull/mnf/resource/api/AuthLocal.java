package devnull.mnf.resource.api;

import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Local
@Path("auth")
public interface AuthLocal {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public void login(@NotNull @FormParam("username") String username, @NotNull @FormParam("password") String password) throws Exception;

    public void logout() throws Exception;
}
