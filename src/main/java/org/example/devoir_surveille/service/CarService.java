package org.example.devoir_surveille.service;

import org.example.devoir_surveille.dto.CarDto;

import java.util.List;

public interface CarService {
    public CarDto saveCar(CarDto carDto);
    public List<CarDto> getCarByModel(String model);
}
