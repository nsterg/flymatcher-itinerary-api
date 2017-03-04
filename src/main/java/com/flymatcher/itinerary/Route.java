package com.flymatcher.itinerary;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

public class Route {

  private String originAirport;
  private String destinationAirport;
  private String originAirportCode;
  private String destinationAirportCode;
  private double price;

  public String getOriginAirport() {
    return originAirport;
  }

  public void setOriginAirport(final String originAirport) {
    this.originAirport = originAirport;
  }

  public String getDestinationAirport() {
    return destinationAirport;
  }

  public void setDestinationAirport(final String destinationAirport) {
    this.destinationAirport = destinationAirport;
  }

  public String getOriginAirportCode() {
    return originAirportCode;
  }

  public void setOriginAirportCode(final String originAirportCode) {
    this.originAirportCode = originAirportCode;
  }

  public String getDestinationAirportCode() {
    return destinationAirportCode;
  }

  public void setDestinationAirportCode(final String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(final double price) {
    this.price = price;
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return reflectionToString(this);
  }

}
