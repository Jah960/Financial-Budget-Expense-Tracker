package com.budgetoptimizer;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



import java.util.HashMap;


public class App{
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Path csvPath = Path.of("transactions.csv");
        List<Transaction> transactions = CsvParser.parseTransactions(csvPath);
        
         
        
        try{
             csvPath = Path.of("transactions.csv");
            transactions = CsvParser.parseTransactions(csvPath);
            
            for(Transaction t : transactions){
                System.out.println(t);
            }

            
            
            TransactionService service = new TransactionService(transactions);

            BigDecimal totalSpent = service.getTotalSpent();
            System.out.println("Total spent: " + totalSpent);


            Map<String, BigDecimal> tolByCat = service.getTolByCat();

            for(Map.Entry<String, BigDecimal> entry : tolByCat.entrySet()){

                System.out.println(entry.getKey() + ": $" + entry.getValue());
            }





            //where the user can choose what group of category to focus on:
            
            System.out.println("If desired, Enter a category to focus on: ");
            String focusCategory = scanner.nextLine();


            System.out.println("\n focused transactions: ");
            for(Transaction t : transactions){
                if(t.getCategory().equalsIgnoreCase(focusCategory)){
                    System.out.println(t);
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println("Error processing reading attempt: " + e.getMessage());
            e.printStackTrace();
        }



    }
}