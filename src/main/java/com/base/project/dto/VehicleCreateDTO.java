package com.base.project.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleCreateDTO {

    @NotBlank
    private String name;
    @NotNull
    private String manufacturer;
    @NotNull
    private String model;
    @NotNull
    private LocalDateTime manufacturingDate;
    @NotNull
    private Double consumePerKmInCity;
    @NotNull
    private Double consumePerKmInRoad;
}
