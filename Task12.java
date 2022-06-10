package Home_Worck3;


import java.util.Scanner;


    class Task12 {
        Integer a;  // 

        Integer sumEnd = 0;
        Integer sumStart = 0;
        Integer sumAllDigit = 0 ;


        //public Task12() {
        
        public int computeAllDigits(int s)
        {

            for(int j = 0; j < 6; j++)
            {
                sumAllDigit = sumAllDigit + s % 10;
                s /= 10;
            }
            return sumAllDigit;
        }



        public boolean computeHappyTicket(int d) 
        {
            for (int i = 0; i < 3; i++)
            {
               sumEnd = sumEnd + d % 10;
                d = d / 10;
            }
            
            //System.out.println(sumAllDigit);
           // System.out.println(sumEnd);
            sumStart = sumAllDigit - sumEnd;
           // System.out.println(sumStart);
           return (sumStart == sumEnd);

        }
        public static void main (String[] args){
        	 System.out.println("Task12");
             Task12 a = new Task12();
             Scanner sc = new Scanner(System.in);

             while (sc.hasNextInt()) {
                 a.a = sc.nextInt();
                 a.computeAllDigits(a.a);
                 System.out.println(a.computeHappyTicket(a.a));

                 if (!sc.hasNextInt()) {
                     System.err.println("Вы ввели не число");
                     break;
                 }
                
             }
             sc.close();
         }
     }
    

   // использование while вложенного туда if  попытка остановить выполнение программы Если пользователь
   // вводит буквы а не цифры.   
    
    
