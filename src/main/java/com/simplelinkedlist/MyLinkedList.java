package com.simplelinkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /* @Description- insert node into first node, second node and third node. */

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

/* @Description- this is used  to appending the data */
    
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    /* @Description-  delete the first element in the linked list of sequence 56->30->70 */

    public INode pop(){
        INode tempNode = this.head;
        this.head = this.head.getNext();
        return tempNode;
    }

    /* @Description-  delete the last element in the linked list of sequence 56->30->70 */

    public INode popLast(){
        INode tempNode = head;
        while (!tempNode.getNext().equals((tail))){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
/* @Description- to search linked list to find Node with value 30 */

    public boolean serchElement(INode serchNode){
        INode tempNode = this.head;
        while (tempNode != null){
            if (tempNode.getKey().equals(serchNode.getKey())){
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}

