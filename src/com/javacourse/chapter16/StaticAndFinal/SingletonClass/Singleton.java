package com.javacourse.chapter16.StaticAndFinal.SingletonClass;

class CoffeeMachine{
    private static CoffeeMachine coffeeMachine = null;
    public float coffeeQty;
    public float milkQty;
    public float waterQty;
    public float sugarQty;
    public final String NAME_OF_COFFEE;
    private String nameOfCoffee;

    private CoffeeMachine(float coffeeQty, float milkQty, float waterQty, float sugarQty){
        this.coffeeQty = coffeeQty;
        this.milkQty = milkQty;
        this.waterQty = waterQty;
        this.sugarQty = sugarQty;
        nameOfCoffee = "Coffee Made By User, Now He Is Happy :-)";
        NAME_OF_COFFEE = nameOfCoffee;
    }
    private CoffeeMachine(String s){
        switch (s){
            case "Latte":
                coffeeQty = 10.5f;
                milkQty = 1f;
                waterQty = 0.5f;
                sugarQty = 5f;
                nameOfCoffee = "Latte";
                break;

            case "Espresso":
                coffeeQty = 16f;
                milkQty = 10f;
                waterQty = 11f;
                sugarQty = 0f;
                nameOfCoffee = "Espresso";
                break;

            case "Dalgona":
                coffeeQty = 11f;
                milkQty = 12f;
                waterQty = 0.5f;
                sugarQty = 4f;
                nameOfCoffee = "Dalgona";
                break;
        }
        NAME_OF_COFFEE = nameOfCoffee;
    }
    public void setWaterQty(float waterQty){
        this.waterQty = waterQty;
    }
    public void setMilkQty(float milkQty){
        this.milkQty = milkQty;
    }
    public void setCoffeeQty(float coffeeQty){
        this.coffeeQty = coffeeQty;
    }
    public static CoffeeMachine getInstance(String s){
        if (coffeeMachine == null){
            coffeeMachine = new CoffeeMachine(s);
        }
        return coffeeMachine;
    }
    public static CoffeeMachine getInstance(float coffeeQty, float milkQty, float waterQty, float sugarQty){
        if (coffeeMachine == null){
            coffeeMachine = new CoffeeMachine(coffeeQty, milkQty, waterQty, sugarQty);
        }
        return coffeeMachine;
    }
}
public class Singleton {
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance(10.4f, 4.5f, 6.5f, 3.5f);
        System.out.println(coffeeMachine.NAME_OF_COFFEE);
    }
}
