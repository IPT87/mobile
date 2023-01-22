package bg.exercise.mobile.repository;

import bg.exercise.mobile.domain.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<Long, UserRole> {
}
