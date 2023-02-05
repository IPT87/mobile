package bg.exercise.mobile.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VehicleModelDto {
    private Long id;
    private String name;
    private String category;
    private int startYear;
    private int endYear;
    private String imageUrl;
    private String brandName;
}
