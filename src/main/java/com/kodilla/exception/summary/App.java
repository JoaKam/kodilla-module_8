package com.kodilla.exception.summary;


import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, Boolean> airports = SearchFlight.createAirportsMap();
        Flight myFlight = new Flight("Warsaw", "Mexico");
        SearchFlight searchMyFlight = new SearchFlight();

        try {
            searchMyFlight.findFlight(myFlight, airports);
        } catch (RouteNotFoundException e) {
            System.out.println("Destination airport is not accessible. Please, select new destination.");
        }

        System.out.println("Searching finished");
    }

}
