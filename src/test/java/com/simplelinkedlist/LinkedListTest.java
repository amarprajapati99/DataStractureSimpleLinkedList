package com.simplelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/* @Description- create a simple linked list of 50, 30, 70 .*/

public class LinkedListTest {
    @Test
    public void whenPassThreeNumber_LinkedListShouldPassedTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(50);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
