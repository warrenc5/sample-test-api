/**
 * Copyright ITCL PTY LTD 2018 - All rights reserved
 */
package devnull.mnf.resource.api;

import devnull.mnf.model.Customer;
import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Local
@Path("customer")
public interface CustomerLocal {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    void create(@NotNull Customer customer) throws Exception;

    @GET
    @Path("/{id}")
    Customer retrieve(@NotNull @PathParam("id") Integer id);

    @PUT
    @Path("/{id}")
    Customer update(@NotNull @PathParam("id") Integer id, @NotNull Customer customer);

    @DELETE
    @Path("/{id}")
    void delete(@NotNull @PathParam("id") Integer id);

}
