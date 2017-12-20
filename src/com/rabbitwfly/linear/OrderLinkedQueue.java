package com.rabbitwfly.linear;

public class OrderLinkedQueue {
    private Node front;
    private Node rear;
    private int length;

    public OrderLinkedQueue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }


    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }

    public boolean isEmptyQ(){
        if(this.front == this.rear & this.rear == null){
            return true;
        } else {
            return false;
        }

    }

    public void addQ(Node elem){
        if(this.length == 0){
            this.front = elem;
            this.rear = elem;
            this.length++;
        } else {
            this.rear.next = elem;
            this.rear = elem;
            this.length++;
        }
    }

    public Node deleteQ(){
        if(this.isEmptyQ()){
            System.out.println("The OrderLinkedQueue is empty and has no item to be deleted!");
            return null;
        } else {
            if (this.length == 1){
                Node temp = this.front;
                this.front = null;
                this.rear = null;
                this.length--;
                return temp;
            } else {
                Node temp = this.front;
                this.front = this.front.next;
                this.length--;
                return temp;
            }
        }
    }

    public void display(){
        if(this.isEmptyQ()){
            System.out.println("The OrderLinkedQueue is empty!");
        } else {
            String disStr = "";
            Node cur = this.front;
            while (cur.next != null) {
                disStr += cur.data + "<--";
                cur = cur.next;
            }
            disStr += cur.data;
            System.out.println(disStr);
        }
    }
}
