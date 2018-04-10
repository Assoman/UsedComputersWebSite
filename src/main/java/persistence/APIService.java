package persistence;

import geocode.ZipCodesItem;
import util.PropertiesLoaderInterface;

import com.fasterxml.jackson.databind.ObjectMapper;
import geocode.Response;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.Properties;


public class APIService implements PropertiesLoaderInterface {
    String propertiesFilePath = "/geocode.properties";
    Properties properties = loadProperties(propertiesFilePath);

    public List ApiServiceCalculation(int zipcode, double distance) throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(properties.getProperty("service.endpoint")
                + "/" + zipcode + "/" + distance + "/" + "mile");
        // JSON big file that we get from the service
        String JsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // mapper part of Jackson
        ObjectMapper mapper = new ObjectMapper();
        // readValue() to read the response and particular class we want to parse into.
        Response response = mapper.readValue(JsonResponse, Response.class);
        List<ZipCodesItem> zipcodes = response.getZipCodes();
        return zipcodes;
    }
}
