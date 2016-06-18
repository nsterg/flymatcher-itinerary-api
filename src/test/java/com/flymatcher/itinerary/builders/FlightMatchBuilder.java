package com.flymatcher.itinerary.builders;

import com.flymatcher.itinerary.FlightMatch;

public class FlightMatchBuilder {

  private String destination;

  private double price;

  private String outboundDate;

  private String inboundDate;

  protected FlightMatchBuilder() {}

  public static FlightMatchBuilder aFlightMatchBuilder() {
    return new FlightMatchBuilder();
  }

  public FlightMatch build() {
    final FlightMatch flightMatch = new FlightMatch();

    flightMatch.setDestination(destination);
    flightMatch.setInboundDate(inboundDate);
    flightMatch.setOutboundDate(outboundDate);
    flightMatch.setPrice(price);

    return flightMatch;
  }

  public FlightMatchBuilder withDefaultValues() {
    this.destination = "PARIS";
    this.price = 100.0;
    this.inboundDate = "2016-01-01";
    this.outboundDate = "2016-01-01";
    return this;
  }

  public FlightMatchBuilder withDestination(final String destination) {
    this.destination = destination;
    return this;
  }

  public FlightMatchBuilder withPrice(final double price) {
    this.price = price;
    return this;
  }

  public FlightMatchBuilder withInboundDate(final String inboundDate) {
    this.inboundDate = inboundDate;
    return this;
  }

  public FlightMatchBuilder withOutboundDate(final String outboundDate) {
    this.outboundDate = outboundDate;
    return this;
  }

}


