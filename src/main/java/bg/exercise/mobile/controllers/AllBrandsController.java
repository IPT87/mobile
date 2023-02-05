package bg.exercise.mobile.controllers;

import bg.exercise.mobile.service.impl.BrandServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/brands/all")
public class AllBrandsController {

    private final BrandServiceImpl brandService;

    public AllBrandsController(BrandServiceImpl brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public ModelAndView getAllBrands(ModelAndView modelAndView) {
        modelAndView.addObject("brandsList", this.brandService.vehicleByBrand("BMW"));
        modelAndView.addObject("brand", "BMW");
        modelAndView.setViewName("brands");

        return modelAndView;
    }

}
