package ist.codex.searchnearbyplaces.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class GetLocationResponseDto {

    private Long id;
    private Double longitude;
    private Double latitude;
    private Integer radius;
}
