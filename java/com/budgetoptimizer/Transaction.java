package com.budgetoptimizer;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Transaction {
    private String category;
    private LocalDate date;
    private BigDecimal amount;


public Transaction(LocalDate date , String category , BigDecimal amount){
    this.date = date;
    this.category = category;
    this.amount = amount;
}

public LocalDate getDate(){
    return date;
}
public String getCategory(){
    return category;
}
public BigDecimal getAmount(){
    return amount;

}
@Override
    public String toString(){
        return "Date: " + date + "\n" +
        "Category:  " + category + "\n" +
        "Amount: " + amount + "\n" +
        "------------------";
    }

}
