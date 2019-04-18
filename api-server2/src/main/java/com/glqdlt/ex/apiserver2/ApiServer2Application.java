package com.glqdlt.ex.apiserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiServer2Application.class, args);
    }


    @GetMapping("/api/greeting")
    public String greeting(){
        return "i'm number 2 server";
    }

}
