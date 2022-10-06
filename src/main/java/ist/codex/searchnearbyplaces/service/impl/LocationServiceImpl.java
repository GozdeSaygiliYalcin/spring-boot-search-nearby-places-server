package ist.codex.searchnearbyplaces.service.impl;

import ist.codex.searchnearbyplaces.entity.Location;
import ist.codex.searchnearbyplaces.repository.ILocationRepository;
import ist.codex.searchnearbyplaces.service.ILocationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServiceImpl implements ILocationService {

    private final ILocationRepository locationRepository;

    public LocationServiceImpl(ILocationRepository locationRepository) {
        super();
        this.locationRepository = locationRepository;
    }

    @Override
    public Optional<Location> findLocation(Double longitude, Double latitude, Integer radius) {
        return locationRepository.findByLatitudeEqualsAndLatitudeEqualsAndRadius(longitude, latitude, radius);
    }

    @Override
    public Location saveLocation(Double longitude, Double latitude, Integer radius) {
        return null;
    }
//
//    @Override
//    public Location saveLocation(Location location) {
//        return locationRepository.save(location);
//    }
}
