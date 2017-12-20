package com.rabbitwfly.linear;



public class MyArray {
    private int[] array;
    private int num = 0;
    private int max;

    public MyArray(int max){
        this.array = new int[max];
        this.max = max;
    }

    public void insertFirst(int elem){
        if(num == 0){
            array[num] = elem;
            num++;
        } else if(num == this.max) {
            System.out.println("The array is full!");
        } else {
            for(int i=num-1; i>=0; i--){
                array[i+1] = array[i];
            }
            array[0] = elem;
            num++;
        }
    }

    public void insertLast(int elem){
        if(num == this.max){
            System.out.println("The array is full!");
        } else {
            array[num] = elem;
            num++;
        }
    }

    public void insert(int elem, int pos){
        if (pos <= 1 && pos > num){
            System.out.println("The index is out of limit!");
        } else {
            for(int i = num-1; i >= pos-1; i--){
                array[i + 1] = array[i];
            }
            array[pos-1] = elem;
            num++;
        }
    }

    public void delete(int elem){
        int index = this.find(elem);
        if(index == -1){
            System.out.println("The element is not in the array!");
        } else {
            if(index == num-1){
                array[index] = 0;
                num--;
            }else{
                for(int i=index; i<num-1; i++){
                    array[i] = array[i+1];
                }
                num--;
            }
        }
    }

    public int find(int elem){
        if(this.isEmpty()){
            System.out.println("The array is empty!");
        }
        for (int i = 0; i < num; i++){
            if(array[i] == elem){
                return i;
            }
        }

        return -1;
    }

    public boolean isEmpty(){
        if(this.num != 0){ return false;
        } else {return true;}
    }

    public void display(){
        String str = "";
        for (int i=0; i<num; i++){
            str += array[i] + "==>";
        }

        System.out.println(str);
    }



}
