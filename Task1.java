package Home_Worck3;

import java.util.*;

public class Task1 {
	int numberDay; 
	   public Task1() {
           System.out.println("Введите номер дня недели");
           Scanner sc = new Scanner(System.in);
           numberDay = sc.nextInt();
           sc.close();
       }

       public void action() {

           switch(numberDay){
           
               case 1 : System.out.println("Monday");
               break;
               case 2 : System.out.println("Thuesday");
               break;
               case 3 : System.out.println("Wenthday");
               break;
               case 4 : System.out.println("Thursday");
               break;
               case 5: System.out.println("FriDay");
               break;
               case 6: System.out.println("Saturday"); 
               break; 
               case 7: System.out.println("Sunday"); 
               break; 
               default: System.out.println("no more day in week. Try again"); 
               break;
               }
               
               
       

}
   

   public static void main(String[] args){
	       System.out.println("Task1");
           Task1 a = new Task1();
           a.action();
  }
}
