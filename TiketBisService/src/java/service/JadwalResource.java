/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.JadwalHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Jadwal;

/**
 * REST Web Service
 *
 * @author ASUS
 */
@Path("jadwal")
public class JadwalResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of JadwalResource
     */
    public JadwalResource() {
    }

    /**
     * Retrieves representation of an instance of service.JadwalResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        JadwalHelper helper = new JadwalHelper();
        List<Jadwal> list = helper.getJadwal();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response.status(200)
                .entity(json)
                .build();
    }

    /**
     * PUT method for updating or creating an instance of JadwalResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Path("addJadwal")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewJadwal(String data) {
        Gson gson = new Gson();
        Jadwal jadwal = gson.fromJson(data, Jadwal.class);
        JadwalHelper helper = new JadwalHelper();
        helper.addNewJadwal(jadwal.getKodeJadwal(), jadwal.getTanggalBerangkat(), jadwal.getTanggalSampai(),
                jadwal.getJamBerangkat(), jadwal.getJamSampai(), jadwal.getNomorBus(), jadwal.getTerminalAsal(),
                jadwal.getTerminalTujuan(), jadwal.getHargaTiket());
        return Response.status(200)
                .entity(jadwal)
                .build();
    }

    @GET
    @Path("cariJadwal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(@QueryParam("terminalAsal") String terminalAsal,
            @QueryParam("terminalTujuan") String terminalTujuan,
            @QueryParam("tglBerangkat") String tglBerangkat) throws ParseException {
        JadwalHelper helper = new JadwalHelper();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date;
        date = format.parse(tglBerangkat);
        List<Jadwal> list = helper.cari(terminalAsal, terminalTujuan, date);
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response.status(200)
                .entity(json)
                .build();
    }
}
