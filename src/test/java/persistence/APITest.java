package persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import geocode.Response;
import geocode.ZipCodesItem;
import org.junit.jupiter.api.Test;
import test.util.PropertiesLoaderInterface;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APITest implements PropertiesLoaderInterface {
    private String propertiesFilePath = "/geocode.properties";
    private Properties properties = loadProperties(propertiesFilePath);
    @Test
    public void testApiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(properties.getProperty("service.endpoint") +
                properties.getProperty("service.parameters"));
        // JSON big file that we get from the service
        String jsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // mapper part of Jackson
        ObjectMapper mapper = new ObjectMapper();
        // readValue() to read the response and particular class we want to parse into.
        Response response = mapper.readValue(jsonResponse, Response.class);
        APIService apiService = new APIService();
        List<ZipCodesItem> zipCodesItems = apiService.apiServiceCalculation(53704, 2);

        assertEquals(53704, zipCodesItems.get(0).getZipCode());
    }
}
