package com.example.loginandrolebasedaccesscontrol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {


    @GetMapping("/public/hello")
    public String getPublic() {
        return "Hello World";
    }

    @GetMapping("/user/hello")
    public String getUser() {
        return "Hello World User";
    }

    @GetMapping("/admin/hello")
    public String getAdmin() {
        return "Hello World Admin";
    }

}
