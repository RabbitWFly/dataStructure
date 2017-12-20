package com.rabbitwfly.linear;




public class SingleLinkedList {
    private int length;
    private Node head;

    public SingleLinkedList(){
        this.length = 0;
        this.head = null;
    }

    //末尾插入
    public void addElem(Node n){
        if(this.length == 0){
            this.head = n;
        } else{
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = n;
        }
        this.length++;
    }

    public void prepend(Node n){
        Node cur = this.head;
        if(cur == null){
            this.head = n;
        } else {
            n.next = cur;
            this.head = n;
        }
        this.length++;
    }
    public void insertBefore(Node n, Node elem){
        Node cur = this.head;
        if(cur == n){
            this.prepend(elem);
        } else {
            while (cur.next != null) {
                if (cur.next == n) {
                    break;
                }
                cur = cur.next;
            }
            elem.next = cur.next;
            cur.next = elem;
            this.length++;
        }
    }

    public void insertAfter(Node n, Node elem){
        if(n.next == null){
            n.next = elem;
            this.length++;
        } else {
            Node cur = this.head;
            while(cur.next != null){
                if(cur == n) break;
                cur = cur.next;
            }
            elem.next = cur.next;
            cur.next = elem;
            this.length++;
        }
    }

    public void delete(Node elem){
        if(!this.find(elem)){
            System.out.println("The elem is not in the List!");
        } else {
            if(elem == this.head){
                this.head = this.head.next;
                this.length--;
            } else {
                Node cur = this.head;
                while (cur.next != null){
                    if(cur.next == elem){
                        break;
                    }
                    cur = cur.next;
                }
                cur.next = cur.next.next;
                this.length--;

            }
        }


    }

    public boolean find(Node elem){
        Node cur = this.head;
        if (cur == elem){
            return true;
        } else {
            while (cur.next != null){
                cur = cur.next;
                if(cur == elem) return true;
            }
            if(cur == elem) return true;
        }
        return false;
    }

    public void clear(){
        this.length = 0;
        this.head = null;
    }

    public void display(){
        if(this.head == null){
            System.out.println("The List is empty!");
        } else {
            String disStr = "";
            Node cur = this.head;
            while (cur.next != null) {
                disStr += cur.data + "==>";
                cur = cur.next;
            }
            disStr += cur.data;
            System.out.println(disStr);
        }
    }
}
