package com.javacourse.chapter13.AbstractClasses;

// Defining Standards Of Hospital

abstract class Hospital{
    abstract public void emergency();
    abstract public void appointment();
    abstract public void admit();
    abstract public void billing();
}

class Fortis extends Hospital{

    @Override
    public void emergency() {
        System.out.println("Emergency");
    }

    @Override
    public void appointment() {
        System.out.println("Appointment");
    }

    @Override
    public void admit() {
        System.out.println("Admit");
    }

    @Override
    public void billing() {
        System.out.println("Billing");
    }
    
}
public class HospitalClass {

}
