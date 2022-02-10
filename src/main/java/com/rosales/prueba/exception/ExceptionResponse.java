package com.rosales.prueba.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionResponse {

	private LocalDateTime date;
	private String message;
	private String details;

}
