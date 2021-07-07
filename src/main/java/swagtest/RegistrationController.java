package swagtest;

import io.micronaut.http.annotation.*;

@Controller("/registration")
public class RegistrationController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
    
    @Get(uri="/login", produces="text/plain")
    public String login() {
        return "login Response";
    }
}