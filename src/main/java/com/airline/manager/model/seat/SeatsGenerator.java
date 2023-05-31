package com.airline.manager.model.seat;

import java.util.HashSet;
import java.util.Set;

public class SeatsGenerator {

	public Set<Seat> createSeats(int rows, int seatsInRow, int firstRowNumber) {
		Set<Seat> seats =  new HashSet<>(); 
		for(int i = 0 ; i < rows ; i++){
			for(int j = 0 ; j< seatsInRow ; j++){
				seats.add(new Seat(""+(firstRowNumber+i)+((char)(65+j))));
			}
		}

		return seats;
	}
}
