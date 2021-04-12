package com.github.sch.consumer;

import com.github.sch.types.Data;
import com.github.sch.types.DataInt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args).registerShutdownHook();
    }

    @Bean
    public CommandLineRunner demo(DataInt dataInt) {
        return (args) -> {
            System.out.println("Getting data");
            System.out.println(dataInt.getData());


            System.out.println("Setting data");
            dataInt.setData(new Data(6, "ByeBye")); // serialization exception

            System.out.println("Done...");
        };
    }
}
