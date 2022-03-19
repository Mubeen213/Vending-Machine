package com.mubeen;

import java.util.Scanner;

/*
    * The vending Machine has 9 different items arranged in 3 rows.
    * Each spot in the machine shows the name,price and quantity of item.
    * The vending machine dispense an item if its quantity is bigger than zero.
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Item[][] items = new Item[][]{
                {new Item("Pepsi",1.99,3), new Item("Friska",1.49,3), new Item("Brisk",1.99,3)},
                {new Item("Fanta",1.99,3), new Item("Lassi",1.49,3), new Item("IceCream",1.99,3)},
                {new Item("Mango",1.99,3), new Item("Coffee",1.49,3), new Item("Chocolate",1.99,3)},
        };

        Machine machine = new Machine(items);
        System.out.println( "\t************************************************");
        System.out.println(machine);

        while(true){
            System.out.println("Pick a row: ");
            int row = sc.nextInt();
            System.out.println("Pick a spot");
            int spot = sc.nextInt();
            boolean dispensed =  machine.dispense(row,spot);
            System.out.println(machine);
            if(dispensed == true){
                System.out.println("\nEnjoy your drink! Press 1 to purchase another");
            }
            else{
                System.out.println("\n Sorry,we're out of this item. Press 1 to purchase another drink");
            }
            if(sc.nextInt() != 1){
                break;
            }
        }
    }
}
