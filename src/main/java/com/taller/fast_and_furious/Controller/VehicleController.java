package com.taller.fast_and_furious.Controller;

import com.taller.fast_and_furious.models.Vehicle;
import com.taller.fast_and_furious.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/assemble")
    public Vehicle assembleVehicle(
            @RequestParam String brand,
            @RequestParam String color,
            @RequestParam int assemblyNumber) {
        return vehicleService.assembleVehicle(brand, color, assemblyNumber);
    }
}
