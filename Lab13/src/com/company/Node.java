package com.company;
public class Node{
    public BlueRayDisk data;
    public Node next;

    Node(){}
    Node(BlueRayDisk inputData){
        data = inputData;
        next = null;
    }
}