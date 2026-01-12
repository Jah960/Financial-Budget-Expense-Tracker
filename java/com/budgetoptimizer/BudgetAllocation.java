package com.budgetoptimizer;
import java.math.BigDecimal;

public class BudgetAllocation {

  private String category;
  private BigDecimal allocatedAmount;

  public BudgetAllocation(String category, BigDecimal allocatedAmount){
    this.category = category;
    this.allocatedAmount = allocatedAmount;
   
  }
  public String getCategory(){
    return category;
  }
  public BigDecimal getAllocatedAmount(){
    return allocatedAmount;

  }

}
 