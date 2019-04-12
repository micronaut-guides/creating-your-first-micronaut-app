package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest // <1>
public class HelloControllerTest {

    @Inject
    @Client("/")
    HttpClient client; // <2>

    @Test
    public void testHello() throws Exception {
        HttpRequest request = HttpRequest.GET("/hello"); // <3>
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals(body, "Hello World");
    }
}
