package Home_Worck3;

import java.util.Scanner;

public class Task5 {
	int year; 
	int month; 
	int day; 
	
	public Task5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date your birthday");
		if(sc.hasNextInt()) 
		{
		   year = sc.nextInt();
		} else 
		{
			System.err.println("It must be number ");
		}
		
		System.out.println("It must be number");
		
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		} else 
		{
			System.err.println(" It must be number.");
		}
		
		
		if (sc.hasNextInt()) {
			day = sc.nextInt();
		} else 
		{
			System.err.println(" It must be number.");
		}
	  }
	
	
	String animals = null;
	public String getYouAnimal() {
		   
		
		    int compute = year % 12;
			
			switch(compute) {
			
			case 0 : animals = "Monkey"; 
			break; 
			
			case 1 : animals = "cock"; 
			break;
			
			case 2 : animals = "Dog";
			break;
			
			case 3 : animals = "Pig";
			break;
			
			case 4 : animals = "Rat";
			break;
			
			case 5 : animals = "Bull";
			break;
			
			case 6 : animals = "Tiger";
			break;
			
			case 7 : animals = "Rabbit";
			break;
			
			case 8 : animals = "Dragon";
			break;
			
			case 9 : animals = "Snake";
			break;
			
			case 10 : animals = "Horse";
			break;
			
			case 11 : animals = "Ram";
			break; 
			
			
			
			}
			
			return animals;  
		
				
	}
	
	
	 String zodiack;
	 public String getZodiack() 
	 {  
		 
		 
		
	    switch(month) {
		case 1 : zodiack = (day > 0 && day < 21) ? "Сapricorn":  "Aquarius";
		        	
		break; 
		
		case 2 : zodiack = (day == 0 && day <= 18 ) ? "Aquarius": "Fish";
		
		break; 
		
		case 3 : zodiack = (day > 0 && day < 21) ? zodiack = "Fish" : "Aries";
		
		break; 
		
		case 4 : zodiack = (day > 0 && day < 20) ? zodiack = "Aries" : "Taurus";
		
		break; 
		
		case 5 : zodiack = (day > 0 && day < 21) ? zodiack = "Taurus" : "Twins";
		
		break;
		
        case 6 : zodiack = (day > 0 && day < 21) ? zodiack = "Twins" : "Cancer";
		
		break;
		
        case 7 : zodiack = (day > 0 && day < 22) ? zodiack = "Cancer" : "Lion";
        
        break;
        
        case 8 : zodiack = (day > 0 && day < 23) ? zodiack = "Lion" : "virgin";
		
		break;
		
        case 9 : zodiack = (day > 0 && day < 24) ? zodiack = "Virgin" : "Scales";
		
		break;
		
        case 10 : zodiack = (day > 0 && day < 23) ? zodiack = "scales" : "��������";
		
		break;
        case 11 : zodiack = (day > 0 && day < 23) ? zodiack = "��������" : "�������";
		
		break;
		
        case 12 : zodiack = (day > 0 && day < 22) ? zodiack = "�������" : "�������";
		
		break;
		
	   }
		
		return zodiack; 
	}
		
     public void output() {
    	 System.out.printf("��� ���� ������� %s ���� �������� �� ���������� ��������� %s", zodiack,
    			 animals);
    	 
     }
     
     public static void main(String[] args) {
    	 Task5 a = new Task5(); 
    	 
    	 a.getYouAnimal();
    	 a.getZodiack();
    	 a.output();
     }
	
}


