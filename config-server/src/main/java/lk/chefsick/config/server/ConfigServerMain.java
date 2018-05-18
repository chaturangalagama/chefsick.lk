package lk.chefsick.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMain.class, args);
    }
}
