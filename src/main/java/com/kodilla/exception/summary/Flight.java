package com.kodilla.exception.summary;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;

    public Flight(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight from " + departureAirport +
                " to " + arrivalAirport;
    }
}
