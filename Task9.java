package Home_Worck3;

import java.util.Scanner;

public class Task9{
	 public static void main(String[] args){
	        System.out.println("Task9");
	        System.out.println("Введите координаты отрезка");
	        Scanner sc = new Scanner(System.in);
	        if(sc.hasNextInt()) 
	        {
	            int point1X = sc.nextInt();
	            int point2X = sc.nextInt();
	            int point1Y = sc.nextInt();
	            int point2Y = sc.nextInt();
	                if(point1X < point2X)
	                {
	                    if(point2Y > point1Y){
	                        System.out.println("отрезок поднимается");
	                    } else if(point2Y < point1Y)
	                    {
	                        System.out.println("отрезок спускается");
	                    } else if (point1X == point2X){
	                        System.out.println("Обрыв");
	                    }


	                } else
	                {
	                    System.err.println("отрезок получился с отрицаетельной длиной");
	                }

	        } else {
	            System.err.println("нужно ввести цифры ");
	        }
	 }
}
