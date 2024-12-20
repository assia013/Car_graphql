package org.example.devoir_surveille.mapper;

import org.example.devoir_surveille.dao.entities.Car;
import org.example.devoir_surveille.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private ModelMapper model = new ModelMapper();

    public CarDto fromCarToCarDto(Car car) {
        return model.map(car, CarDto.class);
    }
    public Car fromCarDtoToCar(CarDto carDto) {
        return model.map(carDto, Car.class);
    }


}
