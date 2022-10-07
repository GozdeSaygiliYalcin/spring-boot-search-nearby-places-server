package ist.codex.searchnearbyplaces.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    INTERNAL_ERROR(2000, "Internal Server Error", INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(2001, "Invalid Parameter Error", BAD_REQUEST),
    DUPLICATE_ERROR(1001, "This location already included on the database", INTERNAL_SERVER_ERROR),
    INVALID_REQUEST(2002, "Invalid Token", BAD_REQUEST);

    //Places Api dokümantasyonundaki exceptionlara göre bu kısım düzenlenecek!

    private int code;
    private String message;
    HttpStatus httpStatus;

}
