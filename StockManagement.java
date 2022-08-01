package com.bridege.oopsconcept;
import java.util.Scanner;
public class StockManagement {

	public static void main(String[] args) {
		Portfollio portfollio = new Portfollio();
		Accounts account = new Accounts();
		Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while(exit) {
            System.out.println("Enter \n1)To add stock\n2)to display stock\n3)debit from account\n4)exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                	portfollio.stockPortfolio();
                    break;
                case 2:
                	portfollio.display();
                    break;
                case 3:
                    account.debit(portfollio.totalValue);
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    break;
            }
        }

	}

}
