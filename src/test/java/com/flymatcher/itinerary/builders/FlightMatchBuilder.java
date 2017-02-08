package com.flymatcher.itinerary.builders;

import static com.flymatcher.itinerary.builders.RouteBuilder.aRoute;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flymatcher.itinerary.FlightMatch;
import com.flymatcher.itinerary.Route;

public class FlightMatchBuilder {

    private String destination;
    private List<Route> routes;
    private String country;
    private double price;

    private LocalDate outboundDate;

    private LocalDate inboundDate;

    protected FlightMatchBuilder() {
    }

    public static FlightMatchBuilder aFlightMatchBuilder() {
        return new FlightMatchBuilder();
    }

    public FlightMatch build() {
        final FlightMatch flightMatch = new FlightMatch();

        flightMatch.setDestination(destination);
        flightMatch.setRoutes(routes);
        flightMatch.setCountry(country);
        flightMatch.setInboundDate(inboundDate);
        flightMatch.setOutboundDate(outboundDate);
        flightMatch.setPrice(price);

        return flightMatch;
    }

    public FlightMatchBuilder withDefaultValues() {
    // @formatter:off
      return this
            .withDestination("PARIS")
            .withInboundDate("2016-01-01")
            .withOutboundDate("2016-01-01")
            .withPrice(100.0)
                .withRoutes(aRoute().withOriginAirport("MAD").withDestinationAirport("CDG"),
                            aRoute().withOriginAirport("ATH").withDestinationAirport("CDG"))
            .withCountry("France");
    // @formatter:on

    }

    public FlightMatchBuilder withDestination(final String destination) {
        this.destination = destination;
        return this;
    }

    public FlightMatchBuilder withCountry(final String country) {
        this.country = country;
        return this;
    }

    public FlightMatchBuilder withRoutes(final RouteBuilder... builders) {
        return withRoutes(Arrays.asList(builders));
    }

    public FlightMatchBuilder withRoutes(final List<RouteBuilder> builders) {
        if (null == this.routes) {
            this.routes = new ArrayList<Route>();
        }

        for (final RouteBuilder builder : builders) {
            this.routes.add(builder.build());
        }

        return this;
    }

    public FlightMatchBuilder withPrice(final double price) {
        this.price = price;
        return this;
    }

    public FlightMatchBuilder withInboundDate(final LocalDate inboundDate) {
        this.inboundDate = inboundDate;
        return this;
    }

    public FlightMatchBuilder withInboundDate(final String inboundDate) {
        this.inboundDate = parse(inboundDate);
        return this;
    }

    public FlightMatchBuilder withOutboundDate(final String outboundDate) {
        this.outboundDate = parse(outboundDate);
        return this;
    }

    public FlightMatchBuilder withOutboundDate(final LocalDate outboundDate) {
        this.outboundDate = outboundDate;
        return this;
    }

}
