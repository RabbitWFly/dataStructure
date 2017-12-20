package com.rabbitwfly.linear;

public class DLinkedList {
    private int length;
    private DNode head;

    public DLinkedList(){
        this.length = 0;
        this.head = null;
    }

    public void addElem(DNode elem){
        if(this.head == null){
            this.head = elem;
        } else {
            DNode cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = elem;
            elem.prev = cur;
        }
        this.length++;
    }

    public void prepend(DNode elem){
        DNode cur = this.head;
        if(cur == null){
            this.head = elem;
        } else {
            cur.prev = elem;
            elem.next = cur;
            this.head = elem;
        }
        this.length++;
    }

    public void insertBefore(DNode n, DNode elem){
        if(!this.find(n)){
            System.out.println("The reference position is not found!");
        } else {
            DNode cur = this.head;
            if(cur == n){
                elem.next = cur;
                this.head = elem;
            } else{
                while(cur.next != null){
                    cur = cur.next;
                    if(cur == n){
                        break;
                    }
                }
                cur.prev.next = elem;
                elem.prev = cur.prev;
                cur.prev = elem;
                elem.next = cur;
            }
            this.length++;
        }
    }

    public void insertAfter(DNode n, DNode elem){
        if(!this.find(n)){
            System.out.println("The reference position is not found!");
        } else {
            if(n.next == null){
                n.next = elem;
                elem.prev = n;
            } else {
                elem.next = n.next;
                n.next.prev = elem;
                n.next = elem;
                elem.prev = n;
            }
            this.length++;
        }
    }

    public void delete(DNode elem){
        if(!this.find(elem)){
            System.out.println("The element is not found to be deleted!");
        } else {
            if(elem == this.head){
                this.head = elem.next;
                elem.next.prev = null;
            } else if(elem.next == null){
                elem.prev.next = null;
            } else {
                elem.prev.next = elem.next;
                elem.next.prev = elem.prev;
            }
            this.length--;
        }
    }

    public void clear(){
        this.length = 0;
        this.head = null;
    }

    public boolean find(DNode elem){
        DNode cur = this.head;
        if(cur == elem){
            return true;
        } else {
            while(cur.next != null){
                cur = cur.next;
                if(cur == elem){
                    return true;
                }
            }
        }

        return false;
    }

    public void display(){
        if(this.head == null) {
            System.out.println("The DLinkedList is empty!");
        } else{
           String disStr = "";
           DNode cur = this.head;
           while(cur.next != null){
               disStr += cur.data + "<====>";
               cur = cur.next;
           }
           disStr += cur.data;

           System.out.println(disStr);
        }
    }
}
