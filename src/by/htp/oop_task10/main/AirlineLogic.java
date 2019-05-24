package by.htp.oop_task10.main;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
    private Airline[] airlines;

    public AirlineLogic(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getByDestination(String destination) {
        List<Airline> airlines = new ArrayList<Airline>();

        for(Airline airline: this.airlines) {
            if (airline.getDestination().equals(destination)) {
                airlines.add(airline);
            }
        }

        return airlines;
    }

    public List<Airline> getByDay(String day) {
        List<Airline> airlines = new ArrayList<Airline>();

        for(Airline airline: this.airlines) {
            if (airline.getWeekDays().equals(day)) {
                airlines.add(airline);
            }
        }

        return airlines;
    }

    public List<Airline> getByDayAndTime(String day, int departureTime) {
        List<Airline> airlines = new ArrayList<Airline>();

        for(Airline airline: this.airlines) {
            if (airline.getWeekDays().equals(day) && airline.getDepartureTime() > departureTime) {
                airlines.add(airline);
            }
        }

        return airlines;
    }
}
