package StrategyDesign;

import java.util.Scanner;

public class StrategyPatternMain {
	 public static void main(String[] args) {
         Scanner s=new Scanner(System.in);  
         System.out.print("Enter the first value: ");  
         float value1=s.nextFloat();  
         System.out.print("Enter the second value: ");  
         float value2=s.nextFloat();
         Context context = new Context(new Addition());          
         System.out.println("Addition = " + context.executeStrategy(value1, value2));  
 
         context = new Context(new Substraction());       
         System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  
 
         context = new Context(new Mutiplication());        
         System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
      }  
}
