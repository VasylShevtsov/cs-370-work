package edu.whitman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest{
    private LinkedList linkedList;

    @BeforeEach
    public void setUp(){
        linkedList = new LinkedList();
    }

    @Test
    public void testGetHead(){
        assertEquals(linkedList.getHead(), null);
    }

    @Test
    public void testGetNumberOfNodes(){
        assertEquals(linkedList.getNumberOfNodes(), 0);
    }

    @Test
    public void testInsertFront(){
        linkedList.insertFront(4);
        assertEquals(linkedList.getHead().getData(), 4);
    }

    @Test
    public void testNumberNodesAfterNodesInsertion(){
        linkedList.insertFront(12);
        linkedList.insertFront(14);
        assertEquals(linkedList.getNumberOfNodes(), 2);
    }

    @Test
    public void testRemoveFromFrontkWithoutNodes(){
        assertEquals(linkedList.removeFromFront(), -1);
    }

    @Test 
    public void testRemoveFromFrontkWithNodes(){
        linkedList.insertFront(12);
        linkedList.insertFront(14);
        linkedList.insertFront(20);
        linkedList.insertFront(40);
        assertEquals(linkedList.removeFromFront(), 40);
    }

    
}