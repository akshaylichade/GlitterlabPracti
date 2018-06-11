package com.glitterlab.examplequeue;
/*
Program to Perform Enqueue, Dequeue operation on Queue
 */
public class QueueImpl {
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public QueueImpl(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    /*
    Method to add element in Queue
     */
    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow Unable to add Element "+item);
        }
        else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.println("Element "+item+" is Pushed to Queue");
        }
    }

    /*
    Method to delete element in Queue
    */
    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow");
        }
        else{
            front++;
            if(front == capacity-1){
                System.out.println("Pop Operation done"+queueArr[front-1]);
                front = 0;
            }
            else {
                System.out.println("Pop operation done"+queueArr[front-1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity)
            status = true;
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0)
            status = true;
        return status;
    }

    public static void main(String[] args) {
        QueueImpl impl = new QueueImpl(5);
        impl.enqueue(5);
        impl.enqueue(6);
        impl.enqueue(7);
        impl.enqueue(8);
        impl.enqueue(9);
        impl.enqueue(10);

        impl.dequeue();
        impl.dequeue();
    }
}
