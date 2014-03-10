package com.vit.rclient;

import java.util.Scanner;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

public class MyClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/RESTWebService/webresources";

    public MyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("generic");
    }

    public String getHtml(String school) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (school != null) {
            resource = resource.queryParam("school", school);
        }
        return resource.request(javax.ws.rs.core.MediaType.TEXT_HTML).get(String.class);
    }

    public void putHtml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.TEXT_HTML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.TEXT_HTML));
    }

    public void close() {
        client.close();
        
    }
    
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter School Name");
        String input = sc.nextLine();
        MyClient m = new MyClient();
        System.out.println(m.getHtml(input));        
    }
}
