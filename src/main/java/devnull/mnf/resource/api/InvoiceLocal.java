/**
 * Copyright ITCL PTY LTD 2018 - All rights reserved
 */
package devnull.mnf.resource.api;

import devnull.mnf.model.Invoice;
import javax.ejb.Local;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Local
@Path("invoice")
public interface InvoiceLocal {

    @POST
    @Path("/")
    void create(@NotNull Invoice invoice) throws Exception;

    @GET
    @Path("/{id}")
    Invoice retrieve(@NotNull @PathParam("id") Integer id);

    @PUT
    @Path("/{id}")
    Invoice update(@NotNull @PathParam("id") Integer id, @NotNull Invoice invoice);

    @DELETE
    @Path("/{id}")
    void delete(@NotNull @PathParam("id") Integer id);

}
