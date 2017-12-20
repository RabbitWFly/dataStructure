package com.rabbitwfly.linear;

//堆栈数组实现
public class StackO {
    private int[] array;
    private int top;
    private int maxSize;

    public StackO(int maxSize){
        this.array = new int[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
    }

    public void push(int elem){
        if(top+1 == maxSize){
            System.out.println("The stack is full!");
        } else {
            top++;
            array[top] = elem;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("The stack is empty!");
            return -1;
        } else {
            int temp = top;
            top--;
            return array[temp];
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("The stack is empty!");
        } else {
            String disStr = "";
            for(int i=0; i<=top;i++){
                disStr += array[i] + "==>";
            }
            System.out.println(disStr);
        }
    }
}
