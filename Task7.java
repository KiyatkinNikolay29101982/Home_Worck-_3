package Home_Worck3;

import java.util.Scanner;

public class Task7 {
	char symbol; 
	
	public Task7() {
		System.out.println("������� ������: ");
		Scanner sc = new Scanner(System.in); 
		symbol = sc.next().charAt(0); 
		sc.close();
	}
	
	public  void exam() {
		if(symbol >= 'a' && symbol <= 'z') {
			System.out.println(symbol + " -��� ������ ���������� ��������");
		} else if(symbol >= 'a' && symbol <= '�') {
			System.out.println(symbol + " -��� ������ ��������"); 
		} else if(symbol >= '0' && symbol <= '9') {
			System.out.println(" -������ ������� ������"); 
		} else {
			System.out.println(" -������ �������� ������"); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Task7");
		Task7 a = new Task7();
		
		a.exam();
	}

}
