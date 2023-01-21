//Класс содержит метод проверки входных параметров кредита
public class Check_the_data {

    //метод принимает в качестве параметров значения, введенные пользователем
    public static void check(float Summa_kredita, float Egemesyachniy_platej, float Procent, String type_of_client) throws Parametrs_Exception {

        if (Summa_kredita <= 0 || Egemesyachniy_platej <= 0 || Procent <= 0) {                                                      //проверка числовых параметров кредита на отрицательность
            throw new Parametrs_Exception("Числовые параметры кредита не могут быть отрицательными или нулевыми");
        } else if (     !(   (type_of_client.equals("human")) ||  (type_of_client.equals("business"))  )        ) {                 //проверка параметра, содержащего тип клиента
            throw new Parametrs_Exception("Задан неизвестный тип клиента: \"" + type_of_client + "\"");
        } else if ( (type_of_client.equals("human")) && (Egemesyachniy_platej<=Summa_kredita*Procent/100/12) ) {                    //проверка граничных условий для типа клиента "человек"
            throw new Parametrs_Exception("Указана слишком высокая процентная ставка. Кредит выплатить невозможно" );
            
        } else if ((type_of_client.equals("business")) && (Egemesyachniy_platej<=Summa_kredita*Procent/100/12/(1+Procent/100))) {   //проверка граничных условий для типа клиента "бизнесс"
            throw new Parametrs_Exception("Указана слишком высокая процентная ставка. Кредит выплатить невозможно" );
        }

    }

}