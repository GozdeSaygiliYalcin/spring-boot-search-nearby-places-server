package ist.codex.searchnearbyplaces.service;

import ist.codex.searchnearbyplaces.dto.request.SaveLocationRequestDto;
import ist.codex.searchnearbyplaces.entity.Location;
import java.util.Optional;


public interface ILocationService  {


    Optional<Location> findLocation(Double longitude, Double latitude, Integer radius);

   // Location saveLocation(SaveLocationRequestDto dto);
   // Location saveLocation(Location location);
    Location saveLocation(Double longitude, Double latitude, Integer radius);
}
