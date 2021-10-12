package com.company;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        startTime = java.time.LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = java.time.LocalTime.now();
    }

    public void stop() {
        endTime = java.time.LocalTime.now();
    }

    public double getElapsedTime() {
        double a = endTime.toSecondOfDay();
        double b = startTime.toSecondOfDay();
        return a - b;
    }
}
