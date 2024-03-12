package com.browserstack.junitresultaggregator;


import com.browserstack.TransformerUtils.TransformerSvc;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@ComponentScan(basePackages = {"com.browserstack.TransformerUtils"})
@SpringBootApplication
public class JestJsonConverter {

    @Autowired
    TransformerSvc transformerSvc;

    public static void main(String... args) throws IOException, UnirestException {
        SpringApplication.run(JestJsonConverter.class, args);
    }

}
