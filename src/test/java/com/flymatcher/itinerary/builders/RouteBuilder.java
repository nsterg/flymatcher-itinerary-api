package com.flymatcher.itinerary.builders;

import com.flymatcher.itinerary.Route;

public class RouteBuilder {

  private String originAirport;
  private String destinationAirport;
  private String originAirportCode;
  private String destinationAirportCode;
  private double price;

  private RouteBuilder() {}

  public static RouteBuilder aRoute() {
    return new RouteBuilder();
  }

  public Route build() {
    final Route route = new Route();

    route.setOriginAirport(originAirport);
    route.setDestinationAirport(destinationAirport);
    route.setOriginAirportCode(originAirportCode);
    route.setDestinationAirportCode(destinationAirportCode);
    route.setPrice(price);

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

  public RouteBuilder withOriginAirportCode(final String originAirportCode) {
    this.originAirportCode = originAirportCode;
    return this;
  }

  public RouteBuilder withDestinationAirportCode(final String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
    return this;
  }

  public RouteBuilder withPrice(final double price) {
    this.price = price;
    return this;
  }

  public RouteBuilder withDefaultValues() {
    this.destinationAirportCode = "MAD";
    this.originAirportCode = "ATH";
    this.destinationAirport = "Madrid";
    this.originAirport = "Athens";
    this.price = 50;
    return this;
  }

}
