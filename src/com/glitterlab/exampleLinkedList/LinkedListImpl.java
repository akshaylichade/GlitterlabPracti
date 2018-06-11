package com.glitterlab.exampleLinkedList;
/*
Program to perform LinkedList operation.
 */
import org.w3c.dom.Node;

public class LinkedListImpl {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    /*
    To add Node in LinkedList
     */
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /*
    To Add Node at Perticular Location
     */
    public void insertAfter(Node preNode, int newData){
        if(preNode == null){
            System.out.println("The Previous Node cannot be Null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = preNode.next;
        preNode.next = newNode;

    }

    /*
    Append a new node at the End
     */
    public void append(int newData){
    Node newNode = new Node(newData);
    if(head == null){
        head = new Node(newData);
        return;
    }
    newNode.next = null;

    Node last = head;
    while (last.next!=null){
        last = last.next;
    }
    last.next = newNode;
    return;
    }

    /*
    Tp Print the Linked List
     */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl limpl = new LinkedListImpl();

        limpl.append(6);
        limpl.push(2);
        limpl.push(8);
        limpl.insertAfter(limpl.head.next,11);
        limpl.printList();

        limpl.head = new Node(15);
        Node second = new Node(25);
        Node third = new Node(35);

        limpl.head.next = second;
        second.next = third;
        limpl.push(20);
        System.out.println("Operation Complete");
    }
}
