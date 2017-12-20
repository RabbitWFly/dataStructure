package com.rabbitwfly.linear;

public class LinearTest {

    public static void main(String[] args){
//        MyArray m = new MyArray(10);
//        m.insertFirst(4);
//        m.insertFirst(3);
//        m.insertFirst(2);
//        m.insertFirst(1);
//        m.insertLast(6);
//        m.insert(10, 3);
//        m.display();
//        m.insert(20, 4);
//        m.display();
//        m.delete(20);
//        m.display();
//        m.delete(6);
//        m.display();
//        m.delete(1);
//        m.display();
        //-------------------------
        Node one = new Node("one");
        Node two = new Node("two");
        Node three = new Node("three");
        Node four = new Node("four");
        Node five = new Node("five");
        Node six = new Node("six");
        Node sev = new Node("sev");
//        SingleLinkedList ss = new SingleLinkedList();
//        ss.addElem(one);
//        ss.addElem(two);
//        ss.addElem(three);
//        ss.display();
//        ss.prepend(four);
//        ss.insertBefore(four, five);
//        ss.display();
//        ss.insertAfter(four, six);
//        ss.display();
//        ss.insertAfter(three, sev);
//        ss.display();
//        ss.delete(sev);
//        ss.display();
//        ss.delete(one);
//        ss.display();
//        ss.delete(five);
//        ss.display();

//        DNode one = new DNode("one");
//        DNode two = new DNode("two");
//        DNode three = new DNode("three");
//        DNode four = new DNode("four");
//        DNode five = new DNode("five");
//        DNode six = new DNode("six");
//        DNode sev = new DNode("sev");
//
//        DLinkedList d = new DLinkedList();
//        d.prepend(one);
//        d.addElem(two);
//        d.prepend(three);
////        d.insertBefore(two, four);
//        d.insertAfter(two, four);
//        d.prepend(five);
//        d.prepend(six);
//        d.prepend(sev);
//        d.display();
//        d.delete(five);
//        d.display();

        //堆栈数组实现测试
//        StackO s = new StackO(5);
//        s.push(1);
//        s.push(10);
//        s.display();
//        s.push(23);
//        s.push(25);
//        s.push(76);
//        s.display();
//        s.push(14);
//        s.display();
//        System.out.println(s.pop());
//        s.pop();
//        s.pop();
//        s.pop();
//        s.pop();
//        s.pop();
//        s.display();
        //堆栈链表实现
//        StackT s = new StackT();
//        Node one = new Node("one");
//        Node two = new Node("two");
//        Node three = new Node("three");
//        s.push(one);
//        s.push(two);
//        s.push(three);
//        s.display();
//        System.out.println(s.pop().data);
//        s.pop();
//        s.pop();
//        s.display();
        //队列顺序存储
//        OrderLineQueue q = new OrderLineQueue(5);
//        q.addQ(14);
//        q.addQ(12);
//        q.addQ(8);
//        q.addQ(18);
//        System.out.println(q.getFront());
//        q.deleteQ();
//        q.deleteQ();
//        q.deleteQ();
//        q.deleteQ();
//        q.deleteQ();
//        System.out.println(q.getFront());
//        q.display();
//        System.out.println(q.getLength());
        //队列环存储
//        OrderCircleQueue o = new OrderCircleQueue(6);
//        o.addQ(12);
//        o.addQ(13);
//        o.addQ(15);
//        o.addQ(3);
//        o.addQ(36);
//        o.deleteQ();
//        System.out.println(o.deleteQ());
//        System.out.println(o.deleteQ());
//        System.out.println(o.deleteQ());
//        System.out.println(o.deleteQ());
//        System.out.println(o.getFront());
//        System.out.println(o.getRear());
//        System.out.println(o.isEmptyQ());
//        System.out.println(o.isFullQ());
//        o.display();

        OrderLinkedQueue q = new OrderLinkedQueue();
        q.addQ(one);
        q.addQ(two);
        q.addQ(three);
//        System.out.println(q.deleteQ().data);
//        System.out.println(q.deleteQ().data);
        q.deleteQ();
        q.deleteQ();
//        System.out.println(q.deleteQ().data);
        System.out.println(q.getLength());
        q.display();
    }
}
