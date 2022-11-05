package pl.lodz.p.it.usermodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/guest")
    public String hiGuest() {
        return "Hi guest";
    }

    @GetMapping("/user")
    public String hiUser() {
        return "Hi user";
    }

    @GetMapping("/admin")
    public String hiAdmin() {
        return "Hi admin";
    }
}
