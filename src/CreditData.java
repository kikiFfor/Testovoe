/**
 * Класс отвечает за хранение данных
 */

import java.util.Scanner;

public class CreditData {

    String enteredString;
    float amountOfCredit;
    float monthlyPayment;
    float percentageRate;
    String typeOfClient;

    void enteringCreditParametrs() {

        Scanner input = new Scanner(System.in);
        enteredString = input.nextLine();
        System.out.println();
    }

    void setParametrs() {

        String[] splitedString = enteredString.split(" ");

        amountOfCredit = Float.parseFloat(splitedString[0]);
        monthlyPayment = Float.parseFloat(splitedString[1]);
        percentageRate = Float.parseFloat(splitedString[2]);
        typeOfClient = splitedString[3];
    }
}

