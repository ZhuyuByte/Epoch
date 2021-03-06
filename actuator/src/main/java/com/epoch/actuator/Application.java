package com.epoch.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Epoch actuator
 *
 * @author zhuyu
 * @since Create in 2021-10-30 星期六
 */
@SpringBootApplication
@EnableAdminServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
