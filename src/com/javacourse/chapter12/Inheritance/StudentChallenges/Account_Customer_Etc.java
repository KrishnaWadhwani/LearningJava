package com.javacourse.chapter12.Inheritance.StudentChallenges;

class Account{
    private int accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String dob;
    protected long balance;
    public Account(int accountNumber, String name, String address, String phoneNumber, String dob, long balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
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
    public String getDob() {
        return dob;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getBalance(){
        return balance;
    }
}
class SavingAccount extends Account{
    public SavingAccount(int accountNumber, String name, String address, String phoneNumber, String dob, long balance) {
        super(accountNumber, name, address, phoneNumber, dob, balance);
    }
    public void deposit(long amount){
        balance+=amount;
    }
    public void withdraw(long withdraw){
        balance-=withdraw;
    }
}
class LoanAccount extends Account{
    private long totalLoanAmount;
    public LoanAccount(int accountNumber, String name, String address, String phoneNumber, String dob, long balance) {
        super(accountNumber, name, address, phoneNumber, dob, balance);
    }
    public void getLoan(long amount){
        balance+=amount;
        totalLoanAmount+=amount;
    }
    public void payEMI(long emi){
        balance-=emi;
        totalLoanAmount-=emi;
    }
    public void topUpLoan(long loan){
        balance+=loan;
        totalLoanAmount+=loan;
    }
    public void cancelLoan(){
        if (balance>=totalLoanAmount){
            balance-=totalLoanAmount;
        }
    }
}
