package com.mubeen;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if(price<0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if(quantity<0){
            throw new IllegalArgumentException("Quantity cannot be empty or negative");
        }
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
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("Price cannot be less than zero");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            throw new IllegalArgumentException("Quantity cannot be less than zero");
        }
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

        return this.name + " : " + this.price + " (" + this.quantity + ") ";
    }
}
