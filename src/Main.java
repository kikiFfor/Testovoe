/**
 * Программа реализует консольное приложение "Кредитный калькулятор". Приложе-
 * ние должно читать из консоли данные о параметрах кредита (сумма взятых в
 * кредит денег ,ежемесячный платеж, процентная ставка, тип клиента) и выводить
 * в консоль посчитанную переплату по кредиту
 *
 * @author kikiFfor;
 * @version 2.1; от 29.01.2023
 * <p>
 * * внесены изменения по оформлению, избавился от транслита
 */

public class Main {
    public static void main(String[] args) throws ParametrsException {

        CreditData newCredit = new CreditData();

        newCredit.enteringCreditParametrs();
        newCredit.setParametrs();

        CheckTheData.check(newCredit);

        CreditCalculator.calculate(newCredit);
    }
}
