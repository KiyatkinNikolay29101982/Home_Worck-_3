package Home_Worck3;

import java.util.*;

public class Task2 {
       int hour; 
       
       public Task2() {
    	   System.out.println("¬ведите час "); 
    	   Scanner sc = new Scanner(System.in); 
    	   hour = sc.nextInt();
    	   sc.close();
       }
       
       public void hello() {
    	   if (hour >= 8 && hour <= 13 ) {
    		   System.out.println("Good morning");
    	   } else if(hour > 13 && hour <= 18) {
    		   System.out.println("Good Day");
    	   } else if (hour > 18 && hour < 24) {
    		   System.out.println("Good evening");
    	   } else {System.out.println("Good night"); 
       }
     }
 
    	   
  public static void main(String [] args) {
	  System.out.println("Task2"); 
	  Task2 a = new Task2(); 
	  a.hello(); 
	  
  }
}
