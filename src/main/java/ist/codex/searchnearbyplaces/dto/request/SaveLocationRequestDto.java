package ist.codex.searchnearbyplaces.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class SaveLocationRequestDto {

    private Long id;
    private Double longitude;
    private Double latitude;
    private Integer radius;
}
