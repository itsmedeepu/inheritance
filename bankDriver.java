package com.raj.Bank;
import java.util.*;
class RBI{
	static String BANKNAME="STATE BANK OF INDIA";
	static String BranchLocation="BANGLORE";
	static String Manager_Name="RAJ";
	
}
class Sbi extends RBI{
	 static String BranchName="BROOKEFIELD";
	 static String Ifsc="SBIN0012501";
}

class Account extends Sbi{
	private String accno;
	private String password;
	private String cif;
	private Double balance;
	
	public Account(String accno, String password, String cif, Double balance) {
		super();
		this.accno = accno;
		this.password = password;
		this.cif = cif;
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void Deposite(Double balance) {
		this.balance+=balance;
	}
	public void Withdraw(Double balance) {
		
		this.balance-=balance;
	}



	public String getAccno() {
		return accno;
	}
	
	public void setAccno(String accno) {
		
		this.accno=accno;
		
	}


	public String getcif() {
		return cif;
	}
	
	public void setcif(String cif) {
		this.cif=cif;
		
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

class User extends Account{
	private String username;
	private String cno;
	public User(String accno, String password, String cif, Double balance, String username, String cno) {
		super(accno, password, cif, balance);
		this.username = username;
		this.cno = cno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getcno() {
		return cno;
	}
	public void setcno(String cno) {
		this.cno = cno;
	}
	
	

	
}
public class bankDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u=null;
		
		boolean f=true;
		System.out.println("Welcome to Sbi");
		
		while(f) {
			
			
			System.out.println("select options \n1.Create account \n2.Depsoit ammount \n3.Withdraw ammount \n4.Check balance \n5.Change password \n6.Account Details \n7.Exit");
			int op = sc.nextInt();
			 switch(op) {
			 case 1:{
			 
				 System.out.println("Enter Account Number");
				 	String accno=sc.next();
					System.out.println("Enter Password");
					String password=sc.next();
					System.out.println("Enter cif number");
					String cif =sc.next();
					
					System.out.println("Enter Balance");
					Double balance=sc.nextDouble();
					System.out.println("Enter customer Name");
					String username=sc.next();
					System.out.println("Enter customer number");
					String cno=sc.next();
					
					u=new User(accno,password,cif,balance,username,cno);
					System.out.println("Account Created Sucessfully");	 
				 
				 System.out.println("*******************");	 
			 }
			 break;
			 case 2:{
				 if(u==null) {
					 System.out.println("No Accounts found");
					 System.out.println("*************");
				 }
				 else {
					 System.out.println("Enter ammount to be  Deposited");
						Double balance=sc.nextDouble();
					 u.Deposite(balance);
					 System.out.println("Ammount Deposited Sucessfully "+balance);
					 System.out.println("*************");
				 } 
			 }break;
			 case 3:{
				 
				 if(u==null) {
					 System.out.println("No Accounts found");
					 System.out.println("*************"); 
				 }
				 else {
					 System.out.println("Enter ammount to be withdrawn");
					 Double balance = sc.nextDouble();
					 u.Withdraw(balance);
				 System.out.println("Ammount withdrwan Sucessfully : "+balance);
					 System.out.println("*************");	 
				 }
			 }break;
			 case 4:{
				 if(u==null) {
					 System.out.println("No Accounts found");
					 System.out.println("*************");
					 
				 }
				 else {
					
					 System.out.println(u.getBalance());
					 System.out.println("*************");
				 } 
			 }break;
			 case 5:{
				 if(u==null) {
					 System.out.println("No Accounts found");
					 System.out.println("*************");
					 
				 }
				 else {
					 
					 System.out.println("Enter new Password");
					 String password =  sc.next();
					 u.setPassword(password);
					 System.out.println("Password set Successfuly");
					 System.out.println("*************");
				 } 
				 
				 
			 }break;
			 case 6:{
				 if(u!=null) {
				 System.out.println("*******************");	 
				 System.out.println("BANK NAME :"+ User.BANKNAME);
				 System.out.println("BRANCH NAME :"+ User.BranchName);
				 System.out.println("BRANCH LOCATION :"+ User.BranchLocation);
				 System.out.println("BRANCH IFSC :"+User.Ifsc);
				 System.out.println("BRANCH MANAGER NAME :"+User.Manager_Name);
				 System.out.println("ACCOUNT NO :"+u.getAccno());
				 System.out.println("USER NAME :"+u.getUsername());
				 System.out.println("USER NO :"+u.getcno());
				 System.out.println("ACCOUNT CIF :"+u.getcif());
				 System.out.println("ACCOUNT BALANCE :"+u.getBalance());
				 
				 }
				 else {
					 System.out.println("No Accounts Found");
				 }
			 }break;
			 case 7:{
				 System.out.println("THANK YOU VISIT AGAIN");
				 f=false;
				 
			 }break; 
			 default:
				 System.out.println("Enter correct options");
			 } 
		 }
			
		}
		
	}


