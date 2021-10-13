package run;

import java.util.Date;
import java.util.Scanner;

import operations.*;
import processor.Processor;
import variables.Variables;

public class Run {
   public Run(){
   } 
   
   public void run(){
      Scanner scan = new Scanner(System.in);
      int c,d,e,h;
      c = scan.nextInt();
      d = scan.nextInt();
      e = scan.nextInt();
      h = scan.nextInt();
      scan.close();
      Date date = new Date();
      Variables var = new Variables(c, d, e, h);
      Processor processor1 = new Processor(new Mul(5, var.getA()), new Mul(2, var.getC()));
      processor1.run();
      Processor processor2 = new Processor(new Sum(processor1.getOperation(0).getTotal(), var.getB()), new Div(processor1.getOperation(1).getTotal(), var.getD()));
      processor2.run();
      Processor processor3 = new Processor(new Sum(processor2.getOperation(0).getTotal(), processor2.getOperation(1).getTotal()));
      processor3.run();
      Processor processor4 = new Processor(new Sum(processor3.getOperation(0).getTotal(), var.getE()));
      processor4.run();
      Processor processor5 = new Processor(new Div(processor4.getOperation(0).getTotal(), h));
      processor5.run();
      System.out.println("Result for (5a + b + 2 * c / d + 3) / h = " + processor5.getOperation(0).getTotal());
      Date date1 = new Date();
      System.out.println(date1.getTime() -date.getTime());
   }
}