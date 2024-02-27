package com.base.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class VehicleResponseDTO {

    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "manufacturer")
    private String manufacturer;
    @JsonProperty(value = "model")
    private String model;
    @JsonProperty(value = "manufacturingDate")
    private LocalDateTime manufacturingDate;
    @JsonProperty(value = "consumePerKmInCity")
    private Double consumePerKmInCity;
    @JsonProperty(value = "consumePerKmInRoad")
    private Double consumePerKmInRoad;

}
