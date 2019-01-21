package devnull.mnf.resource.api;

import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Local
@Path("auth")
public interface AuthLocal {

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@NotNull @FormParam("username") String username, @NotNull @FormParam("password") String password) throws Exception;

    @GET
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    public void logout() throws Exception;
}
