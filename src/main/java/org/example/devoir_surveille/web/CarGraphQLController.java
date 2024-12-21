package org.example.devoir_surveille.web;

import lombok.AllArgsConstructor;
import org.example.devoir_surveille.dto.CarDto;
import org.example.devoir_surveille.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {
    private CarService carService;
    @MutationMapping
    public CarDto saveCar(@Argument CarDto car) {
        return carService.saveCar(car);
    }

    @QueryMapping
    public List<CarDto> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }
}
