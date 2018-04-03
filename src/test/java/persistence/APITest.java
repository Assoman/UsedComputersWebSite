package persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Response;
import entity.ZipCodesItem;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APITest {
    @Test
    public void testApiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://www.zipcodeapi.com/rest/W6Xx087DjLfGWvBgfkaP3G612cGXDccl9B4b37SFVs0YOj2ooZp4wDEfdnUO0UMN/radius.json" +
                "/53704/2/mile");
        // JSON big file that we get from the service
        String JsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // mapper part of Jackson
        ObjectMapper mapper = new ObjectMapper();
        // readValue() to read the response and particular class we want to parse into.
        Response response = mapper.readValue(JsonResponse, Response.class);
        int item = response.getZipCodes().size();

        assertEquals(1, item);
    }
}
