package com.flymatcher.itinerary;

import static com.flymatcher.itinerary.builders.FlightMatchBuilder.aFlightMatchBuilder;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlightMatchUnmarshalTest {

  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper();
  }

  @Test
  public void shouldUnmarshalFlightMatch()
      throws JsonParseException, JsonMappingException, IOException {
    final FlightMatch expectedDto = aFlightMatchBuilder().withDefaultValues().build();

    final String json =
        readFileToString(new File("src/test/resources/junit/flight-match-response.json"));

    final FlightMatch actualDto = mapper.readValue(json, FlightMatch.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

}

