package Home_Worck3;

import java.util.Scanner;

public class Task8 {
	int x;
	int y; 
	
	public Task8() 
	{
		
		System.out.println("������� �������� x");
		Scanner sc = new Scanner(System.in); 
		if(sc.hasNextInt()) 
		{
			x = sc.nextInt();
		} else 
		{
			System.err.println(" x  �� �����");
		}
	    
		System.out.println("������� �������� y");
		if(sc.hasNextInt()) 
		{
			y = sc.nextInt();
		} else 
		{
			System.err.println("y �� �����");
		}
			 
			
	
		sc.close();
	}
	
	public void  action() 
	{
		if(x % 2 == 0 && y % 2 == 0 || x % 2 == 1 && y % 2 == 1) 
		{
			System.out.println("YES"); 
		} else {
			System.out.println("������� ������ �� ���������");
		}
	}
	public static void main(String[] args) {
	    System.out.println("Task8");
		Task8 a = new Task8();
		a.action();
		
	}

}
