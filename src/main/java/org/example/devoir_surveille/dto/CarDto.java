package org.example.devoir_surveille.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDto {
    private String model;
    private String color;
    private String matricul;
    private double price;
}

