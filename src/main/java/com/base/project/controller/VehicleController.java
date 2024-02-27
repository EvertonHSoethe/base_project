package com.base.project.controller;

import com.base.project.dto.VehicleCreateDTO;
import com.base.project.dto.VehicleResponseDTO;
import com.base.project.service.VehicleService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("base/project/v1/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<VehicleResponseDTO> createVehicle(@RequestBody @Valid VehicleCreateDTO vehicleCreateDTO) {
        return ResponseEntity.ok(vehicleService.create(vehicleCreateDTO));
    }

    @GetMapping("/list")
    public ResponseEntity<List<VehicleResponseDTO>> getVehicles() {
        return ResponseEntity.ok(vehicleService.getVehicles());
    }
}
