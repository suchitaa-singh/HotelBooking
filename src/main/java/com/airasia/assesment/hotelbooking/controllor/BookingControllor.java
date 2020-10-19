package com.airasia.assesment.hotelbooking.controllor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airasia.assesment.hotelbooking.resource.Booking;
import com.airasia.assesment.hotelbooking.resource.Room;
import com.airasia.assesment.hotelbooking.service.BookingService;

/**
 * The Class BookingControllor.
 */
@RestController
@RequestMapping("/v1")
public class BookingControllor {

	/** The service. */
	@Autowired
	private BookingService service;

	/**
	 * Save claim.
	 *
	 * @param booking the booking
	 * @return the response entity
	 */
	@PostMapping("/booking")
	public ResponseEntity<?> saveClaim(@RequestBody Booking booking) {
		booking = service.saveBooking(booking);
		return new ResponseEntity<>(booking, HttpStatus.CREATED);
	}

	/**
	 * Gets the claim detail.
	 *
	 * @param id the id
	 * @return the claim detail
	 */
	@GetMapping("/booking/{id}")
	public ResponseEntity<?> getClaimDetail(@PathVariable("id") int id) {
		Booking booking = service.getBooking(id);
		return new ResponseEntity<>(booking, HttpStatus.OK);
	}

	/**
	 * Gets the available room.
	 *
	 * @param status the status
	 * @return the available room
	 */
	@GetMapping("/room/{status}")
	public ResponseEntity<?> getAvailableRoom(@PathVariable("status") String status) {
		ArrayList<Room> rooms = service.getAvailableRoom(status);
		return new ResponseEntity<>(rooms, HttpStatus.OK);
	}

}
