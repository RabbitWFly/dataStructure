package com.rabbitwfly.tree;

public class Node {
    public String data;
    public Node lchild;
    public Node rchild;
    public Node(String data, Node lchild, Node rchild){
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
}
