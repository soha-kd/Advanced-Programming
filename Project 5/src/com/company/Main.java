package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        Queue q = new Queue(200);
        Printer a = new Printer();
        Printer b = new Printer();
        Printer c = new Printer();

        for (int i = 0; i < 30; i++) {
            Job newjob = new Job(i, new Random().nextInt(1000-10 + 1) + 10);
            q.enqueue(newjob);
        }

        for (int i = 0; i < 10000; i++) {
            if (!a.isWorking()) {
                Job getJob = q.dequeue();
                if (getJob != null) {
                    a.idle += 1;
                    a.setJob(getJob);
                }
                a.setTimercount(0);
            } else {
                a.busy += 1;
                if (a.getTimercount() > a.getNextavail()) {
                    a.setTimercount(0);
                    a.setWorking(false);
                    a.print("A", i);
                }
                a.setTimercount(a.getTimercount() + 1);
            }

            if (!b.isWorking()) {
                Job getJob = q.dequeue();
                if (getJob != null) {
                    b.idle += 1;
                    b.setJob(getJob);
                }
                b.setTimercount(0);
            } else {
                b.busy += 1;
                if (b.getTimercount() > b.getNextavail()) {
                    b.setTimercount(0);
                    b.setWorking(false);
                    b.print("B", i);
                }
                b.setTimercount(b.getTimercount() + 1);
            }

            if (!c.isWorking()) {
                Job getJob = q.dequeue();
                if (getJob != null) {
                    c.idle += 1;
                    c.setJob(getJob);
                }
                c.setTimercount(0);
            } else {
                c.busy += 1;
                if (c.getTimercount() > c.getNextavail()) {
                    c.setTimercount(0);
                    c.setWorking(false);
                    c.print("C", i);
                }
                c.setTimercount(c.getTimercount() + 1);
            }
        }
        System.out.println("Printer A completed " + a.jobs + " and was working " + (a.busy / 100) + "s and was idle " + a.idle + "s");
        System.out.println("Printer B completed " + b.jobs + " and was working " + (b.busy / 100) + "s and was idle " + b.idle + "s");
        System.out.println("Printer C completed " + c.jobs + " and was working " + (c.busy / 100) + "s and was idle " + c.idle + "s");
    }
}
