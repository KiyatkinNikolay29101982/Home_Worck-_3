package Home_Worck3;

import java.util.Scanner;

public class Task6 {
	int year;
	
	Task6(){
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Введите год для того чтобы узнать является ли он висакосным.");
		if(sc.hasNextInt()) {
			
			year = sc.nextInt(); 
		} else {
			System.err.println("Вы ввели не цифру. Пожалуйста введите цифру");
		}
		
		
	}
	
	public void exam() { 
		if (year % 4 == 0 && year % 100 == 0 || year % 100 == 0 && year % 400 == 0 || year % 4 == 0) {
			System.out.println("Год висакосный");
		} else {
			System.out.println("Год обычный"); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Task6");
		Task6 a = new Task6();
		a.exam();
		
	}

}
