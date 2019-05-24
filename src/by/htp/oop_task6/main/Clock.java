package by.htp.oop_task6.main;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private int maxHours = 23;
    private int maxMinutes = 59;
    private int maxSeconds = 59;

    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        if (hours <= maxHours) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

        if (minutes <= maxMinutes) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }

        if (seconds <= maxSeconds) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void setHours(int hours) {
        if (hours <= maxHours) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes <= maxMinutes) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds <= maxSeconds) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }
}
