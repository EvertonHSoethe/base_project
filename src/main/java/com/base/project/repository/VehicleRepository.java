package com.base.project.repository;

import com.base.project.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<VehicleModel, Long> {

    Optional<VehicleModel> findByName(String name);
    Optional<VehicleModel> findByModel(String model);
}