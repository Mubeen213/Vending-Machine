package com.mubeen;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item item){
        this.name = item.name;
        this.price = item.price;
        this.quantity = item.quantity;
    }

    /********* Setters *************/

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /********* Getters ****************/
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString(){

        return "Name: " + this.name +".\n"
                +"Price: " + this.price +".\n"
                +"Qunatity: " + this.quantity + ".\n";
    }
}