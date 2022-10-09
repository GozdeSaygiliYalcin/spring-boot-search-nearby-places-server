package ist.codex.searchnearbyplaces.service.impl;

import ist.codex.searchnearbyplaces.entity.Location;
import ist.codex.searchnearbyplaces.repository.ILocationRepository;
import ist.codex.searchnearbyplaces.service.ILocationService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class LocationServiceImpl implements ILocationService {

    private final ILocationRepository locationRepository;

    public LocationServiceImpl(ILocationRepository locationRepository) {
        super();
        this.locationRepository = locationRepository;
    }

    @Override
    @Transactional
    public Optional<Location> findLocation(Double latitude, Double longitude, Integer radius) {
        return locationRepository.findByLongitudeEqualsAndLatitudeEqualsAndRadiusEquals(longitude, latitude, radius);
    }

    @Override
    @Transactional
    public Location saveLocation(Double latitude, Double longitude, Integer radius) {
        Location location = Location.builder()
                            .longitude(longitude)
                            .latitude(latitude)
                            .radius(radius)
                            .build();
        return locationRepository.save(location);
    }
}
