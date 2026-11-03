package org.example;

public class Trip {
    private String destination;
    private Transport transport;

    public Trip(String destination, Transport transport) {
        this.destination = destination;
        this.transport = transport;
    }

    public String getDestination() {
        return destination;
    }

    public Transport getTransport() {
        return transport;
    }

    @Override
    public String toString() {
        return "Пункт назначения: " + destination + ", транспорт: " + transport;
    }
}
