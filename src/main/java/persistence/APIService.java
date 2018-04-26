package persistence;

import util.PropertiesLoaderInterface;

import com.fasterxml.jackson.databind.ObjectMapper;
import geocode.Response;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * This is the API class that contains the method to calculate the requested Radius for a Zip-code.
 * @author Osamah Shareef
 */

public class APIService implements PropertiesLoaderInterface {
    private String propertiesFilePath = "/geocode.properties";
    private Properties properties = loadProperties(propertiesFilePath);

    /**
     * This method calculates the required zip-codes.
     */
    public List apiServiceCalculation(int zipcode, double distance) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(properties.getProperty("service.endpoint")
                + "/" + zipcode + "/" + distance + "/" + properties.getProperty("service.parameters.distance.unit"));
        // JSON big file that we get from the service
        String jsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // mapper part of Jackson
        ObjectMapper mapper = new ObjectMapper();
        // readValue() to read the response and particular class we want to parse into.
        Response response = null;
        try {
            response = mapper.readValue(jsonResponse, Response.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.getZipCodes();
    }
}
