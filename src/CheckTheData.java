/**
 * Используется для проверки входных данных, введенных пользователем.
 *
 * @author kikiFfor
 * @version 2.0
 * Внесены правки по оформлению кода
 */
class CheckTheData {

    public static void check(CreditData credit) throws ParametrsException {

        //Проверка числовых параметров кредита
        boolean isNumParametrsIncorrect = credit.amountOfCredit <= 0
                || credit.monthlyPayment <= 0
                || credit.percentageRate <= 0;

        //Проверка правильности введения типа клиента
        boolean isTypeOfClientIncor = !((credit.typeOfClient.equals("human"))
                || (credit.typeOfClient.equals("business")));

        //Проверка граничных условий для типа клиента "human"
        boolean isImpossibleForHum = (credit.typeOfClient.equals("human"))
                && (credit.monthlyPayment <= credit.amountOfCredit
                * credit.percentageRate / 100 / 12);

        //Проверка граничных условий для типа клиента "business"
        boolean isImpossibleForBus = (credit.typeOfClient.equals("business"))
                && (credit.monthlyPayment <= credit.amountOfCredit
                * credit.percentageRate / 100 / 12
                / (1 + credit.percentageRate / 100));

        if (isNumParametrsIncorrect) {
            throw new ParametrsException("Числовые параметры кредита "
                    + "не могут быть отрицательными или нулевыми");
        } else if (isTypeOfClientIncor) {
            throw new ParametrsException("Задан неизвестный тип клиента: \""
                    + credit.typeOfClient + "\"");
        } else if (isImpossibleForHum) {
            throw new ParametrsException("Указана слишком высокая процентная"
                    + " ставка. Кредит выплатить невозможно");
        } else if (isImpossibleForBus) {
            throw new ParametrsException("Указана слишком высокая "
                    + "процентная ставка. Кредит выплатить невозможно");
        }

    }
}