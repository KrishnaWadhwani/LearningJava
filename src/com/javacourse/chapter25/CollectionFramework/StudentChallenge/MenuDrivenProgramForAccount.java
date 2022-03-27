package com.javacourse.chapter25.CollectionFramework.StudentChallenge;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    private int accountNumber;
    private String name;
    private int balance;
    public Account(){}
    public Account(int accountNumber, String name, int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    @Override
    public String toString(){
        return "Account Number: "+accountNumber+"\nName: "+name+"\nBalance: "+balance;
    }
}

public class MenuDrivenProgramForAccount {
    static Scanner scin = new Scanner(System.in);
    static HashMap<Integer, Account> accounts = new HashMap<>();
    public static void createAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scin.nextInt();
        if (accounts.get(accountNumber) == null){
            System.out.print("Enter name: ");
            scin.nextLine();
            String name = scin.nextLine();
            System.out.print("Enter balance: ");
            int balance = scin.nextInt();
            Account account = new Account(accountNumber, name, balance);
            accounts.put(accountNumber, account);
            if (accounts.get(accountNumber)!=null){
                System.out.println("Account Created Successfully");
            }
            else{
                System.out.println("Some error occurred while creating account...");
            }
        }
        else{
            System.out.println("Sorry this account number is not available, please try again with another account number");
            createAccount();
        }
        saveAccounts();
        enterYourChoice();
    }
    public static void deleteAccount(){
        System.out.print("Enter Account Number: ");
        int accountNumber = scin.nextInt();
        if (accounts.get(accountNumber)!=null){
            accounts.remove(accountNumber);
            if (accounts.get(accountNumber)==null){
                System.out.println("Account Deleted Successfully...");
            }
            else{
                System.out.println("Some error occurred while deleting your account");
            }
        }
        else{
            System.out.println("Account not available...");
        }
        saveAccounts();
        enterYourChoice();
    }
    public static void viewAccount(){
        System.out.print("Enter Account Number: ");
        int accountNumber = scin.nextInt();
        if (accounts.get(accountNumber)!=null){
            System.out.println(accounts.get(accountNumber));
        }
        else{
            System.out.println("Account not found...");
        }
        enterYourChoice();
    }
    public static void viewAllAccounts(){
        if (!accounts.isEmpty()){
            System.out.println("-----------");
            for (Account a : accounts.values()){
                System.out.println(a);
                System.out.println("-----------");
            }
        }
        else {
            System.out.println("No account found...");
        }
        enterYourChoice();
    }
    // this will save accounts in a text file
    public static void saveAccounts(){
        try(
                FileOutputStream fos = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/StudentChallenge/Accounts.txt/");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            oos.writeInt(accounts.size());
            for (Account a : accounts.values()){
                oos.writeObject(a);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        enterYourChoice();
    }
    public static void exit(){
        System.out.println("Thank you for using out Database");
        System.exit(0);
    }
    public static void mainMenu(){
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. View Account");
        System.out.println("4. View All Accounts");
        System.out.println("5. Save Accounts");
        System.out.println("6. Exit");
    }
    public static void enterYourChoice(){
        System.out.print(">>> ");
        String choice = scin.next();
        switch (choice){
            case "1":
                createAccount();
                break;
            case "2":
                deleteAccount();
                break;
            case "3":
                viewAccount();
                break;
            case "4":
                viewAllAccounts();
                break;
            case "5":
                saveAccounts();
                break;
            case "6":
                exit();
                break;
            default:
                enterYourChoice();
        }
    }
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/StudentChallenge/Accounts.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ){
            Account a;
            int size = objectInputStream.readInt();
            for (int i = 0 ; i < size ; i++){
                a = (Account) objectInputStream.readObject();
                accounts.put(a.getAccountNumber(), a);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        mainMenu();
        enterYourChoice();
    }
}
