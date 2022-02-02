package com.javacourse.chapter14.Interfaces.StudentChallenge;

interface Member{
    void callBack();
}
class Store {
    Member[] member = new Member[100];
    int count = 0;

    public void register(Member member){
        this.member[count++] = member;
    }
    public void inviteMembersForSale(){
        for (int i = 0 ; i < count ; i++){
            this.member[i].callBack();
        }
    }
}
class Customer implements Member {
    String name;
    public Customer(String name){
        this.name = name;
    }
    @Override
    public void callBack(){
        System.out.println("Ok, I Will Visit, "+name);
    }
}
public class CallBackMethod {
    public static void main(String args[]){
        Store store = new Store();

        Customer Krishna = new Customer("Krishna");
        Customer Ramesh = new Customer("Ramesh");

        store.register(Krishna);
        store.register(Ramesh);

        store.inviteMembersForSale();
    }
}