package lk.chefsick.service.registry.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryServerMain {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryServerMain.class, args);
    }
}
