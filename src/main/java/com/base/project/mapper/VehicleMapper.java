package com.base.project.mapper;

import com.base.project.dto.VehicleCreateDTO;
import com.base.project.dto.VehicleResponseDTO;
import com.base.project.model.VehicleModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleResponseDTO convertToResponse(VehicleModel vehicleModel);
    List<VehicleResponseDTO> convertToResponse(List<VehicleModel> vehicleModel);
    VehicleModel convert(VehicleCreateDTO vehicle);
}
