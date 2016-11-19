package com.flymatcher.itinerary.builders;

import static java.time.LocalDate.parse;

import java.time.LocalDate;

import com.flymatcher.itinerary.FlightMatch;

public class FlightMatchBuilder {

  private String destination;

  private double price;

  private LocalDate outboundDate;

  private LocalDate inboundDate;

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
    return this.withDestination("PARIS").withInboundDate("2016-01-01")
        .withOutboundDate("2016-01-01").withPrice(100.0);
  }

  public FlightMatchBuilder withDestination(final String destination) {
    this.destination = destination;
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


