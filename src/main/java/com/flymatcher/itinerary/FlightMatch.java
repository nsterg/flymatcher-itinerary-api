package com.flymatcher.itinerary;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightMatch {

  private String destination;

  private double price;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate outboundDate;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate inboundDate;

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

  public LocalDate getOutboundDate() {
    return outboundDate;
  }

  public void setOutboundDate(final LocalDate outboundDate) {
    this.outboundDate = outboundDate;
  }

  public LocalDate getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(final LocalDate inboundDate) {
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