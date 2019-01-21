/**
 * Copyright ITCL PTY LTD 2018 - All rights reserved
 */
package devnull.mnf.resource.api;

import devnull.mnf.model.Invoice;
import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Local
@Path("invoice")
public interface InvoiceLocal {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    void create(@NotNull Invoice invoice) throws Exception;

    @GET
    @Path("/{id}")

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Invoice retrieve(@NotNull @PathParam("id") Integer id);

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Invoice update(@NotNull @PathParam("id") Integer id, @NotNull Invoice invoice);

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    void delete(@NotNull @PathParam("id") Integer id);

}
