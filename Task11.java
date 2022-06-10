package Home_Worck3;

import java.util.Scanner;

public class Task11 {
	double a;
	double b;
	double c; 
	double x1 = 0; 
	double x2 = 0; 
	double x = 0; 
	
	public Task11() 
	{
		System.out.println("enter a");
		Scanner sc = new Scanner(System.in); 
		if(sc.hasNextDouble()) 
		{
			a = sc.nextDouble();
		} else 
		{
			System.err.println("It must be number");
		}
		System.out.println("enter b");
		if(sc.hasNextDouble()) 
		{
			b = sc.nextDouble();
		} else 
		{
			System.err.println("It must be number");
		}
		System.out.println("enter c");
		if(sc.hasNextDouble()) 
		{
			c = sc.nextDouble();
		} else 
		{
			System.err.println("It must be number");
		}
		
		sc.close();
	}
	
	public void compute() 
	{
		double discriminant = b * b - 4 * a * c;
	
		if (discriminant > 0) 
		{
		    x1 = -b + Math.sqrt(discriminant)/(2 *a);
			x2 = -b - Math.sqrt(discriminant)/(2 * a);
			//System.out.println(x1 + " " + x2);
			System.out.println("the equation has 2 solutions x1 = " + x1 + "x2 = " + x2); 
			
	    } else if(discriminant == 0) 
	    {
	    	x = -b/(2 * a);
	    	System.out.printf("the equation has 1 solutions x = %d", x);
	    } else {
	    	System.out.println("the equation has no solutions");
	    }

   }
	
	public static void main(String[] args) {
		Task11 a = new Task11();
		a.compute();
	}
}
