package assgn;

import java.util.Scanner;
class InvalidBalanceException extends Exception{
    InvalidBalanceException(String message)
    {
    super(message);
    }
}

public class customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the customer ");
        String name = sc.nextLine();
        System.out.println("enter the account number ");
        int acc_num = sc.nextInt();
        System.out.println("enter the balance in the account ");
        int balance=sc.nextInt();
        try
        {
        	if(balance<0)
        	{
        		throw new InvalidBalanceException("Balance can't be less than zero");
        	}
        }
        catch(InvalidBalanceException ex) 
        {
        	System.out.println(ex);
        	//ex.printStackTrace();
        }
        
         
        System.out.println("details of the account holder :\n name:- "+name+"\n account number:- "+acc_num+"\n current balance:- "+balance);
        System.out.println("enter the ammount to withdraw");
        int withdraw = sc.nextInt();
        try{
            if(withdraw>balance)
            throw new InvalidBalanceException("insufficient balance");
            else System.out.println("balance after withdrawl is "+(balance-withdraw));
        }
        catch(InvalidBalanceException e){
            System.out.println(e);
        }
    }
}
