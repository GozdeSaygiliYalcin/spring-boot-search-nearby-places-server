package ist.codex.searchnearbyplaces.repository;

import ist.codex.searchnearbyplaces.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Long> {

    Optional<Location> findByLongitudeEqualsAndLatitudeEqualsAndRadiusEquals (Double latitude,
                                                                              Double longitude,
                                                                              Integer radius);
}
