
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите сумму взятых в кредит денег, ежемесячный платеж, процентную ставку, тип клиента ");

        String parametrs = vvod.nextLine();

        enum p  { String.split(parametrs) }


     /*   switch (type){
            case ("human"):
                Types_of_Credits.for_human();
                break;

            case ("Business"):
                Types_of_Credits.for_Business();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);*/
        }

    }
