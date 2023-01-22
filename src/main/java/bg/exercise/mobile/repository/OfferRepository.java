package bg.exercise.mobile.repository;

import bg.exercise.mobile.domain.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Long, Offer> {
}
