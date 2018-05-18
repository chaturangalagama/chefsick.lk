package lk.chefsick.service.cart.technical.controller;

import lk.chefsick.service.cart.technical.connector.OAuthClientCart;
import lk.chefsick.service.cart.technical.model.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
class ApiController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private OAuthClientCart oAuthClientCart;

    @GetMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

    @GetMapping("/call-menu-from-cart")
    public ResponseEntity<Map> callCartFromMenu(){
        return oAuthClientCart.testClient();
    }

    @GetMapping("/cart")
    public AuthResponse login(){
        return new AuthResponse("Hello Cart", HttpStatus.OK);
    }
}