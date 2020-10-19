package com.airasia.assesment.hotelbooking.exception;

/**
 * The Class NoAvailableRoomException.
 */
public class NoSuchBookingException extends RuntimeException {

	/**
	 * Instantiates a new no available room exception.
	 *
	 * @param message the message
	 */
	public NoSuchBookingException(String message) {
		super(message);
	}
}
