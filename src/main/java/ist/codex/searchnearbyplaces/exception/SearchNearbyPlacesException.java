package ist.codex.searchnearbyplaces.exception;

import lombok.Getter;

@Getter
public class SearchNearbyPlacesException extends RuntimeException{

    private final ErrorType errorType;

    public SearchNearbyPlacesException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public SearchNearbyPlacesException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
