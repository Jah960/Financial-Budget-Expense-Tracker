package com.budgetoptimizer;

import java.math.BigDecimal;
import java.time.Period;

public class Income {
  private BigDecimal amount;
  private Period period;

  public enum Period {
    WEEKLY , MONTHLY , ANNUALLY
  }

  public Income(BigDecimal amount , Period period){
      this.amount = amount;
      this.period = period;

  }

  public BigDecimal getAmount(){
    return amount;
  }
  public Period getPeriod(){
    return period;
  }

}
