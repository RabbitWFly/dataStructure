package com.rabbitwfly.linear;

public class OrderLineQueue {
    private int[] array;
    private int rear;
    private int front;
    private int length;

    public int getLength() {
        return length;
    }

    public int getRear() {
        return rear;
    }

    public int getFront() {
        return front;
    }

    public OrderLineQueue(int MaxSize){
        this.array = new int[MaxSize];
        this.rear = -1;
        this.front = -1;
        this.length = 0;
    }

    public boolean isFullQ(){
        if(this.front == this.rear & this.rear != -1){
            return true;
        } else {
            return false;
        }

    }

    public void addQ(int elem){
        if (this.isFullQ()){
            System.out.println("The Queue is full!");
        } else {
            this.rear++;
            array[rear] = elem;
            this.length++;
        }
    }

    public boolean isEmptyQ(){
        if (this.front == this.rear){
            return true;
        } else {
            return false;
        }
    }

    public int deleteQ(){
        if (this.isEmptyQ()){
            System.out.println("The Queue is empty and has no elem to be deleted");
            return -1;
        } else {
            this.front++;
            this.length--;
            return this.array[rear-1];
        }
    }

    public void display(){
        if(this.isEmptyQ()){
            System.out.println("The Queue is empty!");
        } else {
            String disStr = "";
            for (int i=front+1; i<= rear; i++){
                disStr += array[i] + "<==";
            }
            System.out.println(disStr);
        }
    }
}
