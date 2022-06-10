package Home_Worck3;
import java.util.Scanner;

public class Task10 {

    int numOfFlat;

    int numOfFrontDoor;

    int flatNumber;

    int numberOfFrontDoor = 0;

    public Task10()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число квартир на лестничной площадке");
        if(sc.hasNextInt())
        {
            numOfFlat = sc.nextInt();
            System.out.println("введите число подъездов");
            numOfFrontDoor = sc.nextInt();
            System.out.println("введите номер квартиры.");
            flatNumber = sc.nextInt();
            sc.close();
        } else {
            System.err.println("Вы ввели не числа, нужно вводить число ");
        }


    }


    public int computeNumOfFrontDoor() {
        int numAllFlat = 9 * numOfFlat; //*  numOfFrontDoor;

        numberOfFrontDoor = ((flatNumber) /(numAllFlat)) + 1;

        return numberOfFrontDoor;

    }

    public static void main(String[] args) {
        System.out.println("Task10");

        Task10 a = new Task10();

        if(a.flatNumber > 0 && a.flatNumber < 9 * a.numOfFlat * a.numberOfFrontDoor)
        {
            System.out.printf("Вам нужен %d подъезд", a.computeNumOfFrontDoor());
        } else {
            System.err.println("номер квартиры должен быть строго больше нуля и соответствовать числу квартир в доме");
        }

    }

}
