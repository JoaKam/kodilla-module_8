package com.kodilla.exception.summary;

import java.util.HashMap;
import java.util.Map;

class SearchFlight {

    public SearchFlight() {
    }

    public Map<String, Boolean> createAirportsMap() {

        Map<String, Boolean> airportsMap = new HashMap<>();

        airportsMap.put("Mexico", true);
        airportsMap.put("Barcelona", false);
        airportsMap.put("Chicago", true);
        airportsMap.put("New York", true);
        airportsMap.put("London", false);
        airportsMap.put("Paris", true);
        airportsMap.put("Warsaw", false);
        airportsMap.put("Prague", true);

        return airportsMap;

    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = createAirportsMap();
        String destinationAirport = flight.getArrivalAirport();

        Boolean isFlightFound = airports.get(destinationAirport);

        if (isFlightFound != null) {
            if (isFlightFound) {
                System.out.println(flight + " found.");
            }else{
                System.out.println(flight + " not found.");
            }
        }

        throw new RouteNotFoundException("Destination airport is not accessible.");

    }
}
