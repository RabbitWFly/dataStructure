package com.rabbitwfly.linear;

public class OrderCircleQueue {
    private int[] array;
    private int front;
    private int rear;
    private int MaxSize;

    public OrderCircleQueue(int MaxSize){
        this.array = new int[MaxSize];
        this.front = 0;
        this.rear = 0;
        this.MaxSize = MaxSize;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public boolean isFullQ(){
        if((this.rear+1)%this.MaxSize == this.front){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmptyQ(){
        if(this.front == this.rear){
            return true;
        } else {
            return false;
        }
    }

    public void addQ(int elem){
        if(this.isFullQ()){
            System.out.println("The Ordered and Cirled Queue is full!");
        } else {
            this.rear = (this.rear+1)%this.MaxSize;
            array[this.rear] = elem;

        }
    }

    public int deleteQ(){
        if(this.isEmptyQ()){
            System.out.println("The Ordered and Cirled Queue is empty and has no elem to be deleted!");
            return -1;
        } else {
            this.front = (this.front+1)%this.MaxSize;
            return array[this.front];
        }

    }

    public void display(){
        if(this.isEmptyQ()){
            System.out.println("The Queue is empty!");
        } else {
            String disStr = "";
            int temp = this.front;
            int index = (temp+1)%MaxSize;
            while(index != this.rear){
                disStr += array[index] + "<==";
                index = (index+1)%MaxSize;
            }
            disStr += array[index];
            System.out.println(disStr);
        }
    }


}
