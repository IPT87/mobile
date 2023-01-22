package bg.exercise.mobile.repository;

import bg.exercise.mobile.domain.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Long, Brand> {
}
