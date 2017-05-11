/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import hu.javagladitors.app.etlap.datamodel.Szemely;
import hu.javagladitors.app.etlap.service.memory.DataStore;
import hu.javagladitors.app.etlap.service.memory.SzemelyzetServiceImpl;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Administrator
 */
@Path("/szemely")
public class Szemely_resources {
    @Path("/osszes")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getSzemelyzet()
    {
        return DataStore.szemelyzet.getSzemelyzet();
    }
     @Path("/kedvenc")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getKedvenc(@FormParam("szemely") int ID)
    {
        Szemely szemely;
        try
        {
        SzemelyzetServiceImpl szemelyzet = new  SzemelyzetServiceImpl();
        
        szemely = szemelyzet.getSzemelyByID(ID);
        return szemely.getNeve() + " kedvence a " + szemely.getKedvencEtel().toString();
        }
        catch(Exception e){
        return "Kedvenc étele ismeretlen.";
        }
    }
   
}
