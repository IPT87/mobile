package bg.exercise.mobile.repository;

import bg.exercise.mobile.domain.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> getAllByBrandName(String brandName);
}
