
package Home_Worck3;

import java.util.Scanner;




public class Tasc3 {
	enum Animals{
		TIGER("RRRRR"),
		DOG("Gav"),
		CAT("MYAU"),
		FISH("..."),
		SNAKE("SHHHHH"),
		LION("VAURR"),
		CHIKEN("KO-KO-KO"),
		ELEFANT("FTRUUUU"),
		RAM("BEEEE"), 
		BULL("MUUUUU");
		
		String animalVoice; 
		
		Animals (String animalVoice) {
			this.animalVoice = animalVoice;
		}
		
		public void getAnimalVoice() {
			System.out.println(animalVoice); 
		}
		
		public static void main(String[] args) {
			System.out.println("Task3");
			System.out.println("enter number of animals:\n1-Tiger\n2 Dog\n3-Cat\n4-Fish\n5-Snake\n6-Lion\n7-Chiken\n8-Elefant\n9-Ram\n10-Bull");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
			int a = sc.nextInt(); 
			sc.close();
			switch(a) {
			case 1 : Animals.TIGER.getAnimalVoice();
			break;
			case 2 : Animals.DOG.getAnimalVoice();
			break;
			case 3 : Animals.CAT.getAnimalVoice();
			break;
			case 4 : Animals.FISH.getAnimalVoice();
			break;
			case 5 : Animals.SNAKE.getAnimalVoice();
			break; 
			case 6 : Animals.LION.getAnimalVoice();
			break;
			case 7 : Animals.CHIKEN.getAnimalVoice();
			break;
			case 8 : Animals.ELEFANT.getAnimalVoice();
			break;
			case 9 : Animals.RAM.getAnimalVoice();
			break;
			case 10 : Animals.BULL.getAnimalVoice();
			break;
			default : System.err.println("You can choise only 10 animals");
					}
				} else {
				System.err.println("You need enter digit.");
			}
			
		}
		
	}
}
