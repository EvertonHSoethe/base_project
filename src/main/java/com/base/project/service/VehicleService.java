package com.base.project.service;

import com.base.project.dto.VehicleCreateDTO;
import com.base.project.dto.VehicleResponseDTO;
import com.base.project.mapper.VehicleMapper;
import com.base.project.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository repository;
    private final VehicleMapper mapper;

    public VehicleService(VehicleRepository repository, VehicleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public VehicleResponseDTO create(VehicleCreateDTO vehicle){
       var vehicleSaved = repository.save(mapper.convert(vehicle));
       return mapper.convertToResponse(vehicleSaved);
    }

    public List<VehicleResponseDTO> getVehicles(){
        var listVehicles = repository.findAll();
        return mapper.convertToResponse(listVehicles);
    }
}
