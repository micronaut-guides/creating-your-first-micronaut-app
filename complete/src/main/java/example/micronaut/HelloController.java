package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.awt.*;

@Controller("/hello") // <1>
public class HelloController {
    @Get("/") // <2>
    @Produces(PageAttributes.MediaType.TEXT_PLAIN) // <3>
    public String index() {
        return "Hello World"; // <4>
    }
}
