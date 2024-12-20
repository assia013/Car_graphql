package org.example.devoir_surveille;

import org.example.devoir_surveille.dto.CarDto;
import org.example.devoir_surveille.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirSurveilleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirSurveilleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService){

        return  args -> {
            carService.saveCar(CarDto.builder().model("ab").color("vert").matricul("12ab").price(2000).build());
            carService.saveCar(CarDto.builder().model("cd").color("jaune").matricul("12cd").price(30000).build());
            carService.saveCar(CarDto.builder().model("ef").color("blanc").matricul("12ef").price(5000).build());
            carService.saveCar(CarDto.builder().model("gh").color("noire").matricul("12gh").price(6000).build());

        };
    }
}
