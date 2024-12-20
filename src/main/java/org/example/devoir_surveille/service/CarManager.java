package org.example.devoir_surveille.service;

import lombok.AllArgsConstructor;
import org.example.devoir_surveille.dao.entities.Car;
import org.example.devoir_surveille.dao.repositories.CarRepository;
import org.example.devoir_surveille.dto.CarDto;
import org.example.devoir_surveille.mapper.CarMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService{
    private CarRepository carRepository;
    private CarMapper carMapper;
    @Override
    public CarDto saveCar(CarDto carDto) {
        return carMapper.fromCarToCarDto(carRepository.save(carMapper.fromCarDtoToCar(carDto)));
    }

    @Override
    public List<CarDto> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }
}
