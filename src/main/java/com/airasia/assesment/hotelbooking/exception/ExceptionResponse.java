package com.airasia.assesment.hotelbooking.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The Class ExceptionResponse.
 * 
 * @author Suchita
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {

	/** The status. */
	private int status;

	/** The message id. */
	private String messageId;

	/** The timestamp. */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
	private Date timestamp;

	/** The message. */
	private String message;

	/** The details. */
	private String details;
}
