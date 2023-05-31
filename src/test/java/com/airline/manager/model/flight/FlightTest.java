package com.airline.manager.model.flight;

import com.airline.manager.model.seat.Seat;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlightTest {

    @Test
    void reservesAvailableSeat() throws Exception {
        Flight flight = FlightBuilder.aFlight().addSeats(Grade.ECONOMY).createFlight();

        Seat reservedSeat = flight.reserveSeat(Grade.ECONOMY);

        assertThat(reservedSeat.getStatus()).isEqualTo(Seat.Status.RESERVED);
    }
}