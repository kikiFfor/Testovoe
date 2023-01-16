
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.print("Insert sum of your credit: ");

        Float credit = vvod.nextFloat();

        System.out.print("Insert your month pay: ");

        Float pay = vvod.nextFloat();

        System.out.println("Insert your type of client: ");

        String type = vvod.nextLine();




        switch (type){
            case ("human"):
                Types_of_Credits.for_human();
                break;

            case ("Business"):
                Types_of_Credits.for_Business();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

    }
}