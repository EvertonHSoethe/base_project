package com.base.project.mapper;

import com.base.project.dto.VehicleCreateDTO;
import com.base.project.dto.VehicleResponseDTO;
import com.base.project.model.Vehicle;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleResponseDTO convertToResponse(Vehicle vehicle);
    List<VehicleResponseDTO> convertToResponse(List<Vehicle> vehicle);
    Vehicle convert(VehicleCreateDTO vehicle);
}
