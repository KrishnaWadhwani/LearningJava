package com.javacourse.chapter11.Object_Oriented_Programming.StudentChallenges;

import java.util.Random;

class Product{
    Random random = new Random();
    private String name = "";
    private final int itemNo = random.nextInt((1000000-100000)+1)+100000; //this id will change everytime, it's not a bug it's a feature
    private double price = 0.0D;
    private int qty = 0;
    public Product(String name, double price, int quantity){
        setName(name);
        setPrice(price);
        setQty(quantity);
    }
    public void setName(String n){
        if (n.isEmpty()){
            throw new RuntimeException("Product Name Is Empty");
        }
        else{
            name = n;
        }
    }
    public void setPrice(double p){
        if (p<0){
            throw new RuntimeException("Enter A Valid Price");
        }
        else{
            price = p;
        }
    }
    public void setQty(int q){
        if (q<0){
            throw new RuntimeException("Enter A Valid Quantity");
        }
        else{
            qty = q;
        }
    }
    public String getName() {
        return name;
    }

    public int getItemNo() {
        return itemNo;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
class Customer{
    Random random = new Random();
    private String name;
    private String address;
    private String phoneNumber;
    private final int userId = random.nextInt((1000000-100000)+1)+100000; //this id will change everytime, it's not a bug it's a feature
    public Customer(String name, String address, String phoneNumber){
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }
    public void setName(String n) {
        if (n.isEmpty()){
            throw new RuntimeException("User Name Is Empty");
        }
        else{
            name = n;
        }
    }
    public void setAddress(String a) {
        if (a.isEmpty()){
            throw new RuntimeException("Address Is Empty");
        }
        else{
            address = a;
        }
    }
    public void setPhoneNumber(String phno) {
        if (phno.length()==13 && phno.matches("[+][0-9]{2}([9]|[7]|[8])[0-9]{9}")){
            phoneNumber = phno;
        }
        else{
            throw new RuntimeException("Invalid Phone Number");
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getUserId() {
        return userId;
    }
}
public class Product_And_Customer {
    public static void main(String[] args){

        //Item

        System.out.println("Displaying Item...");

        Product chips = new Product("Lays", 100, 10);

        System.out.println(chips.getName());
        System.out.println(chips.getPrice());
        System.out.println(chips.getQty());
        chips.setQty(100); //updating the product quantity
        System.out.println(chips.getQty());
        System.out.println(chips.getItemNo());

        // Customer

        System.out.println("Displaying Customer...");

        Customer KrishnaWadhwani = new Customer("Krishna Wadhwani", "BMG ELEGANT CITY", "+919871751551");

        System.out.println(KrishnaWadhwani.getName());
        System.out.println(KrishnaWadhwani.getAddress());
        KrishnaWadhwani.setAddress("BMG ELEGANT CITY, Tower-6 Flat-702"); //updating user address
        System.out.println(KrishnaWadhwani.getAddress());
        System.out.println(KrishnaWadhwani.getPhoneNumber());
        System.out.println(KrishnaWadhwani.getUserId());
    }
}
