package devnull.mnf.resource.api;

import devnull.mnf.model.Account;
import java.util.Collection;
import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Local
@Path("accounts")
public interface AccountLocal {

    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Collection<Account> retrieveAll() throws Exception;

    @Path("/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    void retrieveAll(@NotNull Account account) throws Exception;
}