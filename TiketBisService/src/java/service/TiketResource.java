/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.TiketHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Tiket;

/**
 * REST Web Service
 *
 * @author ASUS
 */
@Path("tiket")
public class TiketResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TiketResource
     */
    public TiketResource() {
    }

    /**
     * Retrieves representation of an instance of service.TiketResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        TiketHelper helper = new TiketHelper();
        List<Tiket> list = helper.getTiket();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response.status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of TiketResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Path("addTiket")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewTiket(String data) {
        Gson gson = new Gson();
        Tiket tiket = gson.fromJson(data, Tiket.class);
        TiketHelper helper = new TiketHelper();
        helper.addNewTiket(tiket.getKodeTiket(), tiket.getNoKursi(), tiket.getNamaCalonPenumpang(), 
                tiket.getNik(), tiket.getUmur(), tiket.getEmail(), tiket.getNoTelepon(), tiket.getAlamat(), 
                tiket.getMetodePembayaran(), tiket.getStatusTiket(), tiket.getKodeJadwal());
        return Response.status(200)
                .entity(tiket)
                .build();
    }
}
