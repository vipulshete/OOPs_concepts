package com.bridege.oopsconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Portfollio {

    double totalValue;
    int noOfStocks;
    Scanner scr = new Scanner(System.in);
    ArrayList<StockDeatils> list = new ArrayList<>();

    void stockPortfolio() {

        System.out.println("Enter number of stocks");
        noOfStocks = scr.nextInt();

        for (int i = 0; i <noOfStocks; i++) {
        	StockDeatils stock = new StockDeatils();
            System.out.println("Enter stock name");
            stock.setStockName(scr.next());
            System.out.println("Enter number of shares");
            stock.setNoOfShares(scr.nextInt());
            System.out.println("Enter each share price");
            stock.setSharePrice( scr.nextDouble());
            list.add(stock);
            double stockValue = stock.getNoOfShares()*stock.getSharePrice();
            totalValue+=stockValue;
        }
    }
    
    void display(){
        for(StockDeatils stock : list){
             System.out.println(stock);
         }
    }
}
