package bg.exercise.mobile.domain.entity;

import bg.exercise.mobile.enums.Engine;
import bg.exercise.mobile.enums.Transmission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "offers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Offer extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;
    @Enumerated(EnumType.STRING)
    private Engine engine;
    @Column(name = "image_url")
    private String imageUrl;
    private int mileage;
    @Column(precision = 19, scale = 2)
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Transmission transmission;
    private int year;
    private LocalDate created;
    private LocalDate modified;
    @OneToOne
    private Model model;
    @OneToOne
    private User seller;

}
