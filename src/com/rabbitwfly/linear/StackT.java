package com.rabbitwfly.linear;


//堆栈的单链表实现
public class StackT {
    private Node top;
    private int length;
    public StackT(){
        this.top = null;
        this.length = 0;
    }

    public void push(Node elem){
        if(top == null){
            top = elem;
        } else {
            elem.next = this.top;
            this.top = elem;
        }
        this.length++;
    }

    public Node pop(){
        if(top == null){
            System.out.println("The stack is empty!");
            return null;
        } else {
            Node temp = this.top;
            this.top = this.top.next;
            this.length--;
            return temp;
        }
    }

    public void display(){
        if(top == null){
            System.out.println("The stack is empty!");
        } else {
            String disStr = "";
            Node cur = this.top;
            while(cur.next != null){
                disStr += cur.data + "===>";
                cur = cur.next;
            }
            disStr += cur.data;
            System.out.println(disStr);
        }
    }
}
