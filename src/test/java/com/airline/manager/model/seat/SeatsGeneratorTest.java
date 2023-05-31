package com.airline.manager.model.seat;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SeatsGeneratorTest {

    private final SeatsGenerator seatsGenerator = new SeatsGenerator();

    @Test
    void generatesSeatsWithProperNumbers() {
        Set<Seat> result = seatsGenerator.createSeats(2, 4, 1);
        assertThat(result).containsExactlyInAnyOrder(
                new Seat("1A"), new Seat("1B"), new Seat("1C"), new Seat("1D"),
                new Seat("2A"), new Seat("2B"), new Seat("2C"), new Seat("2D")
        );
    }
}