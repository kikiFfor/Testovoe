//Консольное приложение “Кредитный калькулятор”.
//Приложение должно читать из консоли данные о параметрах кредита (сумма взятых в кредит денег ,ежемесячный платеж, процентная ставка, тип клиента)
//и выводить в консоль посчитанную переплату по кредиту.

import java.util.Scanner;

public class Main {
        public static void main(String[] args)  throws Parametrs_Exception{

        // Назначаем новый сканнер
        Scanner vvod = new Scanner(System.in);
        System.out.println("\nВведите сумму взятых в кредит денег, ежемесячный платеж, процентную ставку, тип клиента.\n Разделители - пробелы\n");

        //Считываем введенные пользователям данные
        String parametrs = vvod.nextLine();


        // Разбиваем строку на массив
        String[] subparametrs = parametrs.split(" ");


        // Назначаем значения переменным-параметрам:
        float Summa_kredita = Float.parseFloat(subparametrs[0]);
        float Egemesyachniy_platej = Float.parseFloat(subparametrs[1]);
        float Procent = Float.parseFloat(subparametrs[2]);
        String type_of_client = subparametrs[3];


        //Входная проверка данных:
        Check_the_data.check(Summa_kredita, Egemesyachniy_platej, Procent, type_of_client);

        //Вывод таблицы со значениями пользовательских параметров
        System.out.println("ПАРАМЕТРЫ ВАШЕГО КРЕДИТА:\nСумма кредита, руб: " + Summa_kredita);
        System.out.println("Ежемесячный платеж, руб: " + Egemesyachniy_platej);
        System.out.println("Годовая процентная ставка, %: " + Procent);
        System.out.println("Тип клиента: " + type_of_client + "\n");

        //Выбор метода подсчета платы по кредиту:
        switch (type_of_client) {
            case ("human") ->
                Types_of_Credits.for_human(Summa_kredita, Egemesyachniy_platej, Procent);
            case ("business") ->
                Types_of_Credits.for_business(Summa_kredita, Egemesyachniy_platej, Procent);
        }


    }
}
