package com.flymatcher.itinerary;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

public class FlightMatch {

  private String destination;

  private double price;

  private String outboundDate;

  private String inboundDate;

  public String getDestination() {
    return destination;
  }

  public void setDestination(final String destination) {
    this.destination = destination;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(final double price) {
    this.price = price;
  }

  public String getOutboundDate() {
    return outboundDate;
  }

  public void setOutboundDate(final String outboundDate) {
    this.outboundDate = outboundDate;
  }

  public String getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(final String inboundDate) {
    this.inboundDate = inboundDate;
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
