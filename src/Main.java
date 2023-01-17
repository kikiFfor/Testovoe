

import java.util.Scanner;
import java.lang.String;

public class Main {
        public static void main(String[] args) {
        // Назначаем новый сканнер
        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите сумму взятых в кредит денег, ежемесячный платеж, процентную ставку, тип клиента. Разделители - пробелы");

        //Считываем введенные пользователям данные
        String parametrs = vvod.nextLine();


        // Разбиваем строку на массив
        String[] subparametrs = parametrs.split(" ");


        // Назначаем значения переменным-пар;

        float Summa_kredita = Float.parseFloat(subparametrs[0]);
        System.out.println("Сумма кредита, руб: " + Summa_kredita);

        float Egemesyachniy_platej = Float.parseFloat(subparametrs[1]);
        System.out.println("Ежемесячный платеж, руб: " + Egemesyachniy_platej);

        float Procent = Float.parseFloat(subparametrs[2]);
        System.out.println("Годовая процентная ставка, %: " + Procent);

        String type_of_client = subparametrs[3];
        System.out.println("Тип клиента: " + type_of_client);

        //Выбор метода подсчета платы по кредиту

        switch (type_of_client) {
            case ("human"):
                Types_of_Credits.for_human();
                break;

            case ("Business"):
                Types_of_Credits.for_Business();
                break;
            default:
                System.out.println("Неверно указан тип клиента: " + type_of_client);
                break;
        }


    }
}
