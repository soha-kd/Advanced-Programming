package com.company;

public class Queue {
    private int max, rear = 0, front = 0;
    private Job[] queue;

    public Queue(int max) {
        this.max = max;
        this.queue = new Job[max];
    }

    public Job dequeue() {
        if (this.front == this.rear) {
            return null;
        }

        Job lastitem = this.queue[front];
        this.queue[front] = null;
        this.front--;
        return lastitem;
    }

    public void enqueue(Job job) {
        if (this.front == this.max) {
            return;
        }
        if (this.queue[rear] != null) {
            this.shiftQueue();
        }
        this.queue[rear] = job;
    }


    private void shiftQueue() {
        for (int i = this.front; i >= 0; i--) {
            this.queue[i + 1] = this.queue[i];
        }
        this.front++;
    }

    public boolean isEmpty() {
        return this.queue[rear] != null;
    }
}
