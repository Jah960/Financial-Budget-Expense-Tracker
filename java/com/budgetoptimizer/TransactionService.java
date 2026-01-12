package com.budgetoptimizer;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class TransactionService {

  private final List<Transaction> transactions;

  public TransactionService(List<Transaction> transactions){
    this.transactions = transactions;
  }

  public BigDecimal getTotalSpent(){
    BigDecimal total = BigDecimal.ZERO;

    for(Transaction t : transactions){
      total = total.add(t.getAmount());
    }

    return total;
  }
  public Map<String, BigDecimal> getTolByCat(){
    Map<String, BigDecimal> totals = new HashMap<>();

    for(Transaction t : transactions){
      String category = t.getCategory();
      BigDecimal amount = t.getAmount();

      BigDecimal current = totals.getOrDefault(category, BigDecimal.ZERO);

      totals.put(category, current.add(amount));
    }

    return totals;
  }



}
