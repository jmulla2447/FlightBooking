package com.airline.manager;

import com.airline.manager.model.flight.Flight;
import org.junit.jupiter.api.Test;

import static com.airline.manager.model.flight.FlightBuilder.aFlight;
import static org.assertj.core.api.Assertions.assertThat;

class FlightManagerTest {

    @Test
    void findsFlight() {
        FlightManager manager = new FlightManager();
        Flight flight = aFlight().withFlightNo("LO1533").createFlight();

        manager.addNewFlight(flight);

        assertThat(manager.findFlight("LO1533")).isPresent();
    }
}
