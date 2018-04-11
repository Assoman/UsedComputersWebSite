package persistence;

import geocode.ZipCodesItem;
import test.util.PropertiesLoaderInterface;

import com.fasterxml.jackson.databind.ObjectMapper;
import geocode.Response;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APITest implements PropertiesLoaderInterface {
    String propertiesFilePath = "/geocode.properties";
    Properties properties = loadProperties(propertiesFilePath);
    @Test
    public void testApiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(properties.getProperty("service.endpoint") +
                properties.getProperty("service.parameters"));
        // JSON big file that we get from the service
        String JsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // mapper part of Jackson
        ObjectMapper mapper = new ObjectMapper();
        // readValue() to read the response and particular class we want to parse into.
        Response response = mapper.readValue(JsonResponse, Response.class);
        ZipCodesItem zipCodesItem = response.getZipCodes().get(0);

        assertEquals(53704, zipCodesItem.getZipCode());
    }
}
