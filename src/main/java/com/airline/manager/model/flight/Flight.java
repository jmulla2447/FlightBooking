package com.airline.manager.model.flight;

import com.airline.manager.model.seat.NoSeatAvailableException;
import com.airline.manager.model.seat.Seat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Flight {

	private final String flightNo;

	private final String origin;

	private final String destination;

	private Map<Grade, Section> sectionMap = new HashMap<>();

	public Flight(String flightNo, String origin, String destination, Map<Grade, Set<Seat>> seats) {
		this.flightNo = flightNo;
		this.origin = origin;
		this.destination = destination;
		seats.forEach((key, value) -> sectionMap.put(key, new Section(value)));
	}

	public String getFlightNo() {
		return flightNo;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public Seat reserveSeat(Grade grade) throws NoSeatAvailableException {
		Section selection = sectionMap.get(grade);
        return  selection.reserveSeat();
	}

	public long countAvailableSeats(Grade grade) {
		return sectionMap.get(grade).countAvailableSeats();
	}

}
