package Home_Worck3;

import java.util.Scanner;

public class Task4 {
	int x;
	int y;
	
	public Task4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinats");
		if(sc.hasNextInt()) 
		{
			x = sc.nextInt();
		}else {
			System.err.println("It must be number"); 
		}
		
			
	   if(sc.hasNextInt()) { 	
			y = sc.nextInt(); 
		} else {
			System.err.println("It must be number"); 
		}
		
		sc.close();
	}
	
	public void exam() {
		if(x > 0 && y > 0) {
			System.out.println("a point in 1 quarter ");
		} else if (x < 0 && y > 0) {
			System.out.println("a point in 2 quarter");
		} else if(x < 0 && y < 0) {
			System.out.println("a point in 3 quarter"); 
		
		} else if (x > 0 && y < 0) {
			System.out.println("a point in 4 quarter"); 
		} else {
			System.out.println("check  coordinates. It must be number"); 
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("task4"); 
		
		Task4 a = new Task4();
		
		a.exam();
	}
   
}
