package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<Stock> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StockPortfolio sa = new StockPortfolio();
        while (true) {
            System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> sa.addStocks();
                case 2 -> sa.stockReport();
                case 3 -> {
                    System.out.println("exiting");
                    System.exit(0);
                }
                default -> System.out.println("invalid input");
            }
        }
    }

    public void addStocks() {
        Stock stock = new Stock();
        System.out.println("Enter the stock name");
        stock.setStockNames(scanner.next());

        System.out.println("Enter the number of shares present");
        stock.setNumOfShare(scanner.nextDouble());

        System.out.println("Enter the share price");
        stock.setSharePrice(scanner.nextDouble());

        arrayList.add(stock);
    }

    public void stockReport() {
        Double sum = 0.0;
        System.out.println(" STOCK REPORT ");
        for (int i = 0; i < arrayList.size(); i++) {
            Stock s = arrayList.get(i);
            double totalPrice = s.getNumOfShare() * s.getSharePrice();
            totalPrice = sum + totalPrice;
            System.out.println("stock name = " + s.getStockNames() + "\nnumber of shares = " + s.getNumOfShare()
                    + "\nstock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalPrice + "\n");
        }
    }
}
