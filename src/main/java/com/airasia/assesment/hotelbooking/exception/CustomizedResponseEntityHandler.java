package com.airasia.assesment.hotelbooking.exception;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * The Class CustomizedResponseEntityHandler.
 */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityHandler {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(CustomizedResponseEntityHandler.class);

	/**
	 * No available room exception.
	 *
	 * @param ex the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NoAvailableRoomException.class)
	public final ResponseEntity<ExceptionResponse> noAvailableRoomException(NoAvailableRoomException ex,
			WebRequest request) {
		logger.error(ex.getMessage(), ex);
		ExceptionResponse exceptionResponse = new ExceptionResponse(404, "MSG_001", new Date(), "No room avaiblabe",
				request.getContextPath());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	/**
	 * No such booking exception.
	 *
	 * @param ex the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NoSuchBookingException.class)
	public final ResponseEntity<ExceptionResponse> noSuchBookingException(NoSuchBookingException ex,
			WebRequest request) {
		logger.error(ex.getMessage(), ex);
		ExceptionResponse exceptionResponse = new ExceptionResponse(404, "MSG_001", new Date(),
				"No such booking avaiblabe", request.getContextPath());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}
