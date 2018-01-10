package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	System.out.print(this.accountNo + " 계좌가 개설되었습니다.");
    }

    //필요한 메소드 작성
	public void deposit(int money) {
		balance = balance + money;	
	}
	
	public void withdraw(int money) {
		balance = balance - money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
    
   
    
    
    
}
