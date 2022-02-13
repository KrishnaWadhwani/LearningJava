package com.javacourse.chapter19.Multithreading.StudentChallenges;

class ATM {
    static int moneyLeftInTheBank = 0;
    private int isPasswordSet = 0;
    synchronized public void withdraw(int money){
        moneyLeftInTheBank -= money;
    }
    synchronized public void fillMoney(int money){
        System.out.println("Filling Money In The ATM...");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        moneyLeftInTheBank += money;
        checkBalance();
    }
    synchronized public void checkBalance(){
        System.out.println("Total Money Left In ATM: "+moneyLeftInTheBank);
    }
    synchronized public void useATM(String name){
        System.out.println("Welcome To Java Bank");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0 ; i < name.length() ; i++){
            System.out.print(name.charAt(i));
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class Customer extends Thread{
    String name;
    int balance;
    final ATM ATM;
    final String PASSWORD;
    public Customer(String name, int balance, ATM ATM, String password){
        this.name = name;
        this.balance = balance;
        this.ATM = ATM;
        this.PASSWORD = password;
        this.ATM.moneyLeftInTheBank += balance;
    }
    public void withdraw(int money, String inputPassword){
        if (inputPassword.matches(PASSWORD)){
            if (money <= balance){
                ATM.withdraw(money);
                balance -= money;
                System.out.println("Amount Withdrawn By "+name+" Is: "+money);
            }
            else{
                System.out.println("Insufficient Balance!");
            }
        }
        else{
            System.out.println("Wrong Password");
        }
    }
    public void fillMoney(int money){
        this.ATM.moneyLeftInTheBank += money;
        this.balance += money;
    }
    public void checkBalance(){
        System.out.println("Total Money Left In "+name+"'s Account Is: "+balance);
    }

    @Override
    public void run(){
        this.ATM.useATM(this.name);
    }
}

public class ATMMachine {
    public static void main(String[] args){
        ATM atm = new ATM();
        atm.fillMoney(10000);

        Customer KrishnaWadhwani = new Customer("Krishna Wadhwani", 1000, atm, "Krishna123");
        KrishnaWadhwani.start();

        Customer RamuKaka = new Customer("Ramu Kaka", 10000, atm, "Krishna123");
        RamuKaka.start();

        try{
            KrishnaWadhwani.join();
            RamuKaka.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        atm.checkBalance();

        KrishnaWadhwani.withdraw(1000, "Krishna123");
        KrishnaWadhwani.checkBalance();

        RamuKaka.withdraw(1000, "Krishna123");
        RamuKaka.checkBalance();

        atm.checkBalance();
    }
}
