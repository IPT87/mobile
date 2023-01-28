package bg.exercise.mobile.domain.entity;

import bg.exercise.mobile.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    private String username;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "is_active")
    private boolean isActive;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private UserRole role;
    @Column(name = "image_url")
    private String imageUrl;
    private LocalDate created;
    private LocalDate modified;

}
