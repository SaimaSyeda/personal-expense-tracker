package com.saima.expense.exceptions;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(
        description = "ErrorDetails DTO (Data Transfer Object) to transfer the error response data between client and server"
)
@Getter
@Setter
public class ErrorDetails {
    @Schema(
            name = "Error occurred date time"
    )
    private LocalDateTime timestamp;
    @Schema(
            name = "Error message"
    )
    private String message;
    @Schema(
            name = "Error details"
    )
    private String details;
    @Schema(
            name = "Error code"
    )
    private String errorCode;
}
