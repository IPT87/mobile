package bg.exercise.mobile.service.impl;

import bg.exercise.mobile.domain.dto.VehicleModelDto;
import bg.exercise.mobile.domain.entity.Model;
import bg.exercise.mobile.repository.BrandRepository;
import bg.exercise.mobile.repository.ModelRepository;
import bg.exercise.mobile.service.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private final ModelRepository modelRepository;
    private final ModelMapper mapper;

    public BrandServiceImpl(BrandRepository brandRepository, ModelRepository modelRepository, ModelMapper mapper) {
        this.modelRepository = modelRepository;
        this.mapper = mapper;
    }

    @Override
    public List<VehicleModelDto> vehicleByBrand(String brandName) {
        List<Model> models = this.modelRepository.getAllByBrandName(brandName);
        List<VehicleModelDto> vehicleModelDtoList = new ArrayList<>();
        models.forEach(m -> vehicleModelDtoList.add(mapper.map(m, VehicleModelDto.class)));

        return vehicleModelDtoList;
    }
}
