package edu.whitman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class NodeTest{
    private Node firstNode;
    private Node secondNode;

    @BeforeEach
    public void setUp(){
        firstNode = new Node(4, null);
        secondNode = new Node(5, firstNode);
    }

    @Test
    public void testGetDataNode(){
        assertEquals(4, firstNode.getData());
    }

    @Test
    public void testGetNextNode(){
        assertEquals(firstNode.getNext(), null);
        assertEquals(firstNode, secondNode.getNext());
    }
}