package com.simplelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* @Description- create Linked List by adding 30 and 56 to 70.
* Node with data 70 is First Created
* Next 30 is added to 70, Finally 56 is added to 30 and  LinkedList Sequence: 56->30->70 */
public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
}
