package com.company;

public class BlueRayCollection {
    Node Head = null;
    Node Tail = null;
    public void add(String inputTitle, String inputDirector, int inputYOR, double inputCost){
        Node temp = new Node(new BlueRayDisk(inputTitle, inputDirector, inputYOR, inputCost));
        //temp.data = new BlueRayDisk(inputTitle, inputDirector, inputYOR, inputCost);
        if(Head == null){
            Head = temp;
            Tail = temp;
        }else {
            Tail.next = temp;
            Tail = temp;
        }
        //temp.next = Head;
        //Head = temp;
    }
    public void show_all(){
        Node temp = Head;
        while (temp != null){
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }

}