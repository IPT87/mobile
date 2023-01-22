package bg.exercise.mobile.repository;

import bg.exercise.mobile.domain.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Long, Model> {
}
