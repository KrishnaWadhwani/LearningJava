package com.javacourse.chapter16.StaticAndFinal.Static;

class Ciaz{
    static long price = 10L;
    static long onRoadPrice(String city){
        switch (city){
            case "Delhi":
                price = (long) (price+(price*0.1));
                break;
            case "Mumbai":
                price = (long) (price+(price*0.09));
                break;
            case "Lucknow":
                price = (long) (price+(price*0.2));
                break;
            case "Ghaziabad":
                price = (long) (price+(price*0.3));
                break;
        }
        return price;
    }
}
public class Showroom_Example {
    public static void main(String[] args){
        System.out.println("Prices Are In Lakhs");
        Ciaz ciaz = new Ciaz();
        Ciaz ciaz1 = new Ciaz();
        System.out.println(ciaz.price);
        System.out.println(ciaz1.price);
        ciaz.price = 20L;
        System.out.println(ciaz.price);
        System.out.println(ciaz1.price);
        Ciaz.price = 30L;
        System.out.println(ciaz.price);
        System.out.println(ciaz1.price);
        System.out.println(ciaz.onRoadPrice("Ghaziabad"));
    }
}
