package com.base.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
@EqualsAndHashCode
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
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