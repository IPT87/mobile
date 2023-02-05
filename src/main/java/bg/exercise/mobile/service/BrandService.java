package bg.exercise.mobile.service;

import bg.exercise.mobile.domain.dto.VehicleModelDto;

import java.util.List;

public interface BrandService {
    List<VehicleModelDto> vehicleByBrand(String brand);
}
