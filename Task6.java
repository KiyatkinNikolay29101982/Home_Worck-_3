package Home_Worck3;

import java.util.Scanner;

public class Task6 {
	int year;
	
	Task6(){
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("������� ��� ��� ���� ����� ������ �������� �� �� ����������.");
		if(sc.hasNextInt()) {
			
			year = sc.nextInt(); 
		} else {
			System.err.println("�� ����� �� �����. ���������� ������� �����");
		}
		
		
	}
	
	public void exam() { 
		if (year % 4 == 0 && year % 100 == 0 || year % 100 == 0 && year % 400 == 0 || year % 4 == 0) {
			System.out.println("��� ����������");
		} else {
			System.out.println("��� �������"); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Task6");
		Task6 a = new Task6();
		a.exam();
		
	}

}
