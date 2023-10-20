package com.company;

public class Job {
    private int id;
    private int time;

    public Job (int id, int time) {
        this.id = id;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public int getId() {
        return id;
    }
}
