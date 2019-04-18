package com.glqdlt.ex.gatekeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class GatekeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatekeeperApplication.class, args);
    }

}
