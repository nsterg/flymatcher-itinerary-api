package com.flymatcher.itinerary.builders;

import com.flymatcher.itinerary.Route;

public class RouteBuilder {

    private String originAirport;
    private String destinationAirport;

    private RouteBuilder() {
    }

    public static RouteBuilder aRoute() {
        return new RouteBuilder();
    }

    public Route build() {
        final Route route = new Route();

        route.setOriginAirport(originAirport);
        route.setDestinationAirport(destinationAirport);

        return route;
    }

    public RouteBuilder withOriginAirport(final String originAirport) {
        this.originAirport = originAirport;
        return this;
    }

    public RouteBuilder withDestinationAirport(final String destinationAirport) {
        this.destinationAirport = destinationAirport;
        return this;
    }

    public RouteBuilder withDefaultValues() {
        this.destinationAirport = "MAD";
        this.originAirport = "ATH";
        return this;
    }

}
