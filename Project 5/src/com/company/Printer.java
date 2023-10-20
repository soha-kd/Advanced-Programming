package com.company;

public class Printer{
    protected int idle;
    protected int busy;
    protected int jobs;
    private boolean working;
    private int nextavail;
    private int timercount;
    private Job job;

    public Printer() {
        this.idle = 0;
        this.busy = 0;
        this.jobs = 0;
        this.nextavail = 0;
        this.working = false;
    }

    public void setTimercount(int timercount) {
        this.timercount = timercount;
    }

    public int getTimercount() {
        return timercount;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setJob(Job job) {
        this.working = true;
        this.job = job;
        this.nextavail = job.getTime();
    }

    public boolean isWorking() {
        return working;
    }

    public int getNextavail() {
        return nextavail;
    }

    public void print(String pn, int wait) {
        this.jobs++;
        System.out.println("Finished job id: " + this.job.getId() + " by " + pn + " and total time for job: " + ((this.job.getTime() + wait)) / 100);
    }
}
