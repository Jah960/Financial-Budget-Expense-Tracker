package com.budgetoptimizer;
import java.util.List;

public class OptimizationGroup {
  private final List<Transaction> transactions;
  private final List<CategoryLimit> limits;
  private final Income income;

  public OptimizationGroup(List<Transaction> transactions , List<CategoryLimit> limits , Income income){
    
    this.transactions = transactions;
    this.limits = limits;
    this.income = income;

  }
  public List<Transaction> getTransactions(){
    return transactions;
  }
  public List<CategoryLimit> getLimits(){
    return limits;
  }
  public Income getIncome(){
    return income;
  }

}