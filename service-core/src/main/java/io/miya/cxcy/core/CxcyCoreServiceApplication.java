package io.miya.cxcy.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Miyam
 */
@SpringBootApplication
@ComponentScan({"io.miya.cxcy"})
public class CxcyCoreServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CxcyCoreServiceApplication.class, args);
    }
}
