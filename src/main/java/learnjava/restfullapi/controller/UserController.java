package learnjava.restfullapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import learnjava.restfullapi.model.RegisterUserRequest;
import learnjava.restfullapi.model.WebResponse;
import learnjava.restfullapi.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${spring.meta.greeting}")
    private String greetingText;

    @PostMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<String> register(@RequestBody RegisterUserRequest request) {
        userService.register(request);
        return WebResponse.<String>builder().data("ok " + greetingText).build();
    }

}
