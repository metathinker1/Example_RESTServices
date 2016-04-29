package com.example.jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * Created by robertwood on 4/28/16.
 */
public class JerseyApp {
    static Client client = Client.create();

    static String getUrl = "http://www.thomas-bayer.com/sqlrest/";

    public static void getRequest() {
        WebResource webResource = client.resource(getUrl);
        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("HTTP Error: " + response.getStatus());
        }

        String result = response.getEntity(String.class);
        System.out.println("Response from the server: ");
        System.out.println(result);
    }

    public static void main( String[] args )
    {
        getRequest();
    }
}
