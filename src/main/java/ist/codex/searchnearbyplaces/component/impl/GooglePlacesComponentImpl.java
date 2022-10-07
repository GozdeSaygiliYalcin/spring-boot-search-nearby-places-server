package ist.codex.searchnearbyplaces.component.impl;

import ist.codex.searchnearbyplaces.component.IGooglePlacesComponent;
import ist.codex.searchnearbyplaces.entity.Location;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import static ist.codex.searchnearbyplaces.constants.Query.*;

@RequiredArgsConstructor
@Component
public class GooglePlacesComponentImpl implements IGooglePlacesComponent {

    //config kısımları gözden geçirilecek
    private final RestTemplate restTemplate;
    @Value("${google.api.key}")
    private String apiKey;
    @Value("${google.api.url}")
    private String apiUrl;
    @Value("${google.api.scheme}")
    private String apiScheme;

    @Override
    public String searchNearby(Location location) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(this.getRootUri(location), String.class);
        return responseEntity.getBody();
    }
    private String getRootUri(Location location) {

        String url = UriComponentsBuilder
                .newInstance()
                .scheme(apiScheme)
                .host(apiUrl)
                .queryParam(LOCATION, location.getLatitude() + "," + location.getLongitude())
                .queryParam(RADIUS, location.getRadius())
                .queryParam(KEY, apiKey)
                .build()
                .toUriString();

        System.out.println(url);
        return url;
    }

//    OkHttpClient client = new OkHttpClient().newBuilder()
//            .build();
//    MediaType mediaType = MediaType.parse("text/plain");
//    RequestBody body = RequestBody.create(mediaType, "");
//    Request request = new Request.Builder()
//            .url("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522%2C151.1957362&radius=1500&type=restaurant&keyword=cruise&key=YOUR_API_KEY")
//            .method("GET", body)
//            .build();
//    Response response = client.newCall(request).execute();
}
