package com.budgetoptimizer;
import java.util.List;
import java.util.ArrayList;

public class OptimizationService 

{
  public List<BudgetAllocation> optimize (OptimizationGroup problem){
    
    List<CategoryLimit> limits = problem.getLimits();
    List<BudgetAllocation> result = new ArrayList<>();

    for(CategoryLimit limit : limits){
        result.add(new BudgetAllocation(null, null));
    }
    return result;

  }

}
