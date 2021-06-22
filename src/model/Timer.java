package model;

public class Timer {
    int minute = 0;
    int second = 0;

    public Timer() {
    }

    public Timer(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
