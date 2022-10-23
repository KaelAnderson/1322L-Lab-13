package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	BlueRayCollection linkedList =  new BlueRayCollection();
        boolean cont = true;
        do{
    System.out.println("0. Quit\n" +
            "1. Add BlueRay to collection\n" +
            "2. See collection");
    int userChoice = scan.nextInt();


    switch (userChoice){
        case 0:
            cont = false;
            break;
        case 1:
            System.out.println("What is the title?");
            String userTitle = scan.next();
            System.out.println("What is the director?");
            String userDirector = scan.next();
            System.out.println("What is the year of release?");
            int userYOR = scan.nextInt();
            System.out.println("What is the cost?");
            double userCost = scan.nextDouble();
            linkedList.add(userTitle,userDirector,userYOR,userCost);
            break;
        case 2:
            linkedList.show_all();
            break;

    }

    }while (cont);
}
}
