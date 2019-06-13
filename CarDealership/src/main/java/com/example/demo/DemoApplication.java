package com.example.demo;

import com.example.demo.domain.CarModels;
import com.example.demo.domain.CarModelsRepositary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarModelsRepositary repository){
    return args ->{
        repository.save(new CarModels("Honda","Accord")) ;
        repository.save(new CarModels("Honda","Odyssey")) ;
        repository.save(new CarModels("Toyota","Camry")) ;
        repository.save(new CarModels("Toyota","Highlander")) ;
        repository.save(new CarModels("Acura","MDX")) ;


        log.info("CarModels found with findAll():");
        log.info("-------------------------------");

        for (CarModels carmodel : repository.findAll()) {
            log.info(carmodel.toString());

        }
        log.info("");

        repository.findById(5L)
                .ifPresent(carmodel -> {
                    log.info("CarModels found with findById(5L):");
                    log.info("---------------------------------");
                    log.info(carmodel.toString());
                    log.info("");

                });

        log.info("CarModel found with findByMake('Honda''):");
        log.info("---------------------------------------------");
        repository.findByMake("Honda").forEach(bauer -> {
            log.info(bauer.toString());
        });
    };
    }

}
