/**
 * Используется для проверки входных данных, введенных пользователем.
 * @author kikiFfor
 * @version 2.0
 * Внесены правки по оформлению кода
 */
public class CheckTheData {

    public static void check(CreditData credit) throws ParametrsException {

        //Проверка числовых параметров кредита
        boolean stepOne = credit.summaCredita <= 0
                || credit.egemesyachniyPlatej <= 0
                || credit.procent <= 0;

        //Проверка правильности введения типа клиента
        boolean stepTwo = !((credit.typeOfClient.equals("human"))
                || (credit.typeOfClient.equals("business")));

        //Проверка граничных условий для типа клиента "human"
        boolean stepThree = (credit.typeOfClient.equals("human"))
                && (credit.egemesyachniyPlatej <= credit.summaCredita * credit.procent / 100 / 12);

        //Проверка граничных условий для типа клиента "business"
        boolean stepFour = (credit.typeOfClient.equals("business"))
                && (credit.egemesyachniyPlatej <= credit.summaCredita
                        * credit.procent / 100 / 12 / (1+credit.procent/100));

        if (stepOne) {
            throw new ParametrsException("Числовые параметры кредита не могут быть отрицательными или нулевыми");
        } else if (stepTwo) {
            throw new ParametrsException("Задан неизвестный тип клиента: \"" + credit.typeOfClient + "\"");
        } else if (stepThree) {
            throw new ParametrsException("Указана слишком высокая процентная ставка. Кредит выплатить невозможно" );
        } else if (stepFour) {
            throw new ParametrsException("Указана слишком высокая процентная ставка. Кредит выплатить невозможно" );
        }

    }

}