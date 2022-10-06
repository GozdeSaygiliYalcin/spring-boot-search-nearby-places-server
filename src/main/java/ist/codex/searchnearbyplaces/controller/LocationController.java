package ist.codex.searchnearbyplaces.controller;


import ist.codex.searchnearbyplaces.component.IGooglePlacesComponent;
import ist.codex.searchnearbyplaces.dto.request.SaveLocationRequestDto;
import ist.codex.searchnearbyplaces.entity.Location;
import ist.codex.searchnearbyplaces.exception.ErrorMessage;
import ist.codex.searchnearbyplaces.exception.ErrorType;
import ist.codex.searchnearbyplaces.exception.SearchNearbyPlacesException;
import ist.codex.searchnearbyplaces.service.ILocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/searchnearbyplaces")
@RequiredArgsConstructor
public class LocationController {

    private final ILocationService locationService;
    private final IGooglePlacesComponent googlePlacesComponent;

    @GetMapping("/search")
    public ResponseEntity<String> getNearbyPlaces(@RequestParam("long") Double longitude,
                                                    @RequestParam("lat") Double latitude,
                                                    @RequestParam("r") Integer radius) {
        Optional<Location> optionalLocation = locationService.findLocation(longitude, latitude, radius);
        Location location;
            if(optionalLocation.isPresent())
                location = optionalLocation.get();
            else
               location = locationService.saveLocation(longitude, latitude, radius);
            return ResponseEntity.ok(googlePlacesComponent.findNearby(location));
            }
    }

//    @GetMapping("/search")
//    public ResponseEntity<Location> getNearbyPlaces(@RequestBody @Valid SaveLocationRequestDto dto) {
//        Optional<Location> location = locationService.findLocation(dto); //request ve responseler düzenlenecek
//        if(location.isPresent()) {
//            throw new SearchNearbyPlacesException()
//            return ResponseEntity.ok(location.get());
//        }
//        return ResponseEntity.ok(new Location());
//    }
//}
