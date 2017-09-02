package com.kodilla.exception.summary;


public class App {
    public static void main(String[] args) {

        Flight myFlight = new Flight("Warsaw", "Roma");
        SearchFlight searchMyFlight = new SearchFlight();

        try {
            searchMyFlight.findFlight(myFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Please, select new destination.");
        }

        System.out.println("Searching finished");
    }

}
