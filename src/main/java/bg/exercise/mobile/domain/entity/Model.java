package bg.exercise.mobile.domain.entity;

import bg.exercise.mobile.enums.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "models")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Model extends BaseEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Size(min = 8, max = 512)
    @Column(length = 512, name = "image_url")
    private String imageUrl;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private int endYear;

    private LocalDate created;
    private LocalDate modified;
    @ManyToOne
    private Brand brand;

}
