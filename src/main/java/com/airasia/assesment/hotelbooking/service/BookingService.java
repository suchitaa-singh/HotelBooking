package com.airasia.assesment.hotelbooking.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airasia.assesment.hotelbooking.exception.NoAvailableRoomException;
import com.airasia.assesment.hotelbooking.exception.NoSuchBookingException;
import com.airasia.assesment.hotelbooking.repository.BookingRepository;
import com.airasia.assesment.hotelbooking.repository.RoomRepository;
import com.airasia.assesment.hotelbooking.resource.Booking;
import com.airasia.assesment.hotelbooking.resource.Room;

/**
 * The Class BookingService.
 */
@Service
public class BookingService {

	/** The room repository. */
	@Autowired
	RoomRepository roomRepository;

	/** The booking repository. */
	@Autowired
	BookingRepository bookingRepository;

	/**
	 * Save booking.
	 *
	 * @param booking the booking
	 * @return the booking
	 * @throws NoAvailableRoomException the no available room exception
	 */
	public Booking saveBooking(Booking booking) throws NoAvailableRoomException {
		ArrayList<Room> rooms = getAvailableRoom("Available");
		Optional<Room> room = rooms.stream().filter(r -> r.getTotalGuest() >= 4).findAny();
		if (!room.isPresent())
			throw new NoAvailableRoomException("Room is not available");
		room.get().setStatus("Booked");
		booking.setRoomInfo(room.get());
		booking = bookingRepository.save(booking);
		return booking;
	}

	/**
	 * Gets the booking.
	 *
	 * @param id the id
	 * @return the booking
	 */
	public Booking getBooking(long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		if (!booking.isPresent())
			throw new NoSuchBookingException("Booking is not available");
		return booking.get();
	}

	/**
	 * Gets the available room.
	 *
	 * @param status the status
	 * @return the available room
	 * @throws NoAvailableRoomException the no available room exception
	 */
	public ArrayList<Room> getAvailableRoom(String status) throws NoAvailableRoomException {
		Optional<ArrayList<Room>> availableRooms = roomRepository.findAllByStatus(status);
		if (!availableRooms.isPresent())
			throw new NoAvailableRoomException("Room is not available");
		return availableRooms.get();
	}

	/**
	 * Update available room.
	 *
	 * @param room the room
	 * @throws Exception the exception
	 */
	public void updateAvailableRoom(Room room) throws Exception {
		room.setStatus("NotAvailable");
		roomRepository.save(room);
	}
}
