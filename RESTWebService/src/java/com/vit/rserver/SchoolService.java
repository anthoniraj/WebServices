package com.vit.rserver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("generic")
public class SchoolService {

    @Context
    private UriInfo context;
    public SchoolService() 
    {
    }
   
    @GET
    @Produces("text/html")
    public String getHtml(@QueryParam("school") String school)
    {
     Map<String, String> m = new HashMap<String, String>();
     m.put("SCSE", "Cloud Computing");
     m.put("SITE", "Network Simulator");
     m.put("SMBS", "Thermal LAB");
     Set<String> s= m.keySet();
     String out = null;
     for (String temp : s)
     {
         if (temp.equals(school))
         {
             out = m.get(temp);
         }
     }
     return out;
    }

    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
