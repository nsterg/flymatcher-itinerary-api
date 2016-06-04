package com.flymatcher.itinerary;

import java.util.List;

public class ItineraryRequest {
  
  private String outboundDate;
  
  private String inboundDate;
  
  private List<String> airports;

  public String getOutboundDate() {
    return outboundDate;
  }

  public void setOutboundDate(String outboundDate) {
    this.outboundDate = outboundDate;
  }

  public String getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(String inboundDate) {
    this.inboundDate = inboundDate;
  }

  public List<String> getAirports() {
    return airports;
  }

  public void setAirports(List<String> airports) {
    this.airports = airports;
  }
  

}
