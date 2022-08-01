package com.bridege.oopsconcept;

import java.util.Scanner;

public class Accounts {

    void debit(Double accountBalance){
    	
    	int debit;
    	
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the amount to debited : ");
        debit = scr.nextInt();
        if (debit>accountBalance){
            System.out.println("Amount exceeded account balance");
            System.out.println("Current balance is : " + accountBalance);

        }
        else{
            accountBalance-=debit;
            System.out.println("Remaining account balance is : "+accountBalance);
        }
    }

}
