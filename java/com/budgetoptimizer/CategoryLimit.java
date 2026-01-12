package com.budgetoptimizer;

import java.math.BigDecimal;

public class CategoryLimit {
private String category;
private BigDecimal maxAmt;


public CategoryLimit(String category , BigDecimal maxAmt){
  this.category = category;
  this.maxAmt = maxAmt;
}
public String getCategory(){
  return category;
}
public BigDecimal getMaxAmt(){
  return maxAmt;
}

}

