package com.mubeen;

/*
    * The vending Machine has 9 different items arranged in 3 rows.
    * Each spot in the machine shows the name,price and quantity of item.
    * The vending machine dispense an item if its quantity is bigger than zero.
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Item[][] items = new Item[][]{
                {new Item("Pepsi",1.99,3), new Item("Friska",1.49,3), new Item("Brisk",1.99,3)},
                {new Item("Fanta",1.99,3), new Item("Lassi",1.49,3), new Item("IceCream",1.99,3)},
                {new Item("Mango",1.99,3), new Item("Coffee",1.49,3), new Item("Chocolate",1.99,3)},
        };

        Machine machine = new Machine(items);

        machine.dispense(0,0);
        machine.dispense(0,0);
        System.out.println(machine.getItem(0,0));
    }
}
