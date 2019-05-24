package by.htp.oop_task4.main;

public class Train {
    private String destination;
    private int number;
    private String departureTime;

    public Train(String destination, int number, String departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
