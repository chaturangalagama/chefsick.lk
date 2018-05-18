package lk.chefsick.gateway.auth.server.controller;

import lk.chefsick.gateway.auth.server.model.AuthResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class LoginController {

    @PostMapping("/login")
    public AuthResponse login(){
        return new AuthResponse("Login Success (Gateway Auth)", HttpStatus.OK);
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal user(Principal user) {
        return user;
    }
}
