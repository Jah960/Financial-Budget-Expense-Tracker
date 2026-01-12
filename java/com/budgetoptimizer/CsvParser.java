
package com.budgetoptimizer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
//important up above
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CsvParser{

  //skimming through data to get date, cat, and amt for purchases on the optimizer
  public static List<Transaction> parseTransactions(Path CsvPath) throws IOException{

    CSVFormat format = CSVFormat.DEFAULT.builder()
    .setHeader("date","category","amount")
    .setSkipHeaderRecord(true)
    .build();

    try(Reader in = Files.newBufferedReader(CsvPath);
    CSVParser parser = format.parse(in) ){

     
        {
          List<Transaction> list = new ArrayList<>();
          
//looks up specifc field and gives corresponding data
          for(CSVRecord r : parser){

            LocalDate date = LocalDate.parse(r.get("date"));
            
            String category = r.get("category").trim();
            
            BigDecimal amount = new 
            BigDecimal(r.get("amount"));
            
            list.add(new Transaction(date, category, amount));

            
          }
          
          return list;
        }
     
    }
    
  
  }

}