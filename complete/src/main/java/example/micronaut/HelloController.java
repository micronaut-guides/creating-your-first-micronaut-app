package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello") // <1>
public class HelloController {
    @Get("/") // <2>
    public String index() {
        return "Hello World"; // <3>
    }
}
