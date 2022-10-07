package ist.codex.searchnearbyplaces.service;

import ist.codex.searchnearbyplaces.dto.request.SaveLocationRequestDto;
import ist.codex.searchnearbyplaces.entity.Location;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ILocationService  {


    Optional<Location> findLocation(Double latitude, Double longitude, Integer radius);

   // Location saveLocation(SaveLocationRequestDto dto);
   // Location saveLocation(Location location);
    Location saveLocation(Double latitude, Double longitude, Integer radius);
}
